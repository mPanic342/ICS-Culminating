package com.example;

import java.util.Collections;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


@SuppressWarnings("unused")
public class RainbowChooserizer extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Rainbow Chooserizer");

       // primaryStage.getIcons().add(new Image("/resources/mainbg.jpg"));
        // Create buttons for navigation
        Button button1 = new Button("Ranked Mode");
        Button button2 = new Button("Goofy Fun Mode");

        // Set actions for buttons
        button1.setOnAction(e -> showOption1(primaryStage));
        button2.setOnAction(e -> showOption2(primaryStage));

        // Layout for title page
        VBox layout = new VBox(15);
        layout.setAlignment(Pos.CENTER); // Center the buttons
        layout.getChildren().addAll(button1, button2);

        // Add CSS class to the layout
        layout.getStyleClass().add("root");

        // Load CSS
        Scene scene = new Scene(layout, 300, 200);
        try {
            String css = getClass().getResource("/styles.css").toExternalForm();
            scene.getStylesheets().add(css);
        } catch (Exception e) {
            System.err.println("Error loading CSS file: " + e.getMessage());
        }

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showOption1(Stage stage) {
        // Create layout for choosing between Attack and Defense
        VBox layout1 = new VBox(20);
        layout1.setAlignment(Pos.CENTER); // Center the buttons
        Button attackButton = new Button("Attack");
        Button defenseButton = new Button("Defense");
        Button backButton = new Button("Back to Title Page");

        // Set actions for buttons
        attackButton.setOnAction(e -> showAttackOptions(stage));
        defenseButton.setOnAction(e -> showDefenseOptions(stage));
        backButton.setOnAction(e -> start(stage)); // Navigate back to the title page

        layout1.getChildren().addAll(attackButton, defenseButton, backButton);

        // Add CSS class to the layout
        layout1.getStyleClass().add("root");

        Scene scene1 = new Scene(layout1, 300, 200);
        try {
            String css = getClass().getResource("/styles.css").toExternalForm();
            scene1.getStylesheets().add(css);
        } catch (Exception e) {
            System.err.println("Error loading CSS file: " + e.getMessage());
        }

        stage.setScene(scene1);
    }

    private void showAttackOptions(Stage stage) {
        // Get randomized attack operators and strategies
        AttOperatorsStrat attackData = new AttOperatorsStrat();
        attackData.AttOperators();
        attackData.AttStrat();
        List<String> operators = attackData.getAttOperators();
        List<String> strats = attackData.getAttStrat();

        Collections.shuffle(operators);
        Collections.shuffle(strats);

        List<String> selectedOperators = operators.subList(0, 5);
        List<String> selectedStrats = strats.subList(0, 2);

         // Create layout for displaying selected options
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        Label title = new Label("Attack Operators and Strategies:");
        title.getStyleClass().add("title-label");
        layout.getChildren().add(title);
        
        for (String operator : selectedOperators) {
            Label operatorLabel = new Label(operator);
            operatorLabel.getStyleClass().add("operator-label"); // CSS class for operator labels
            layout.getChildren().add(operatorLabel);
        }
    
        for (String strat : selectedStrats) {
            Label stratLabel = new Label(strat);
            stratLabel.getStyleClass().add("operator-label"); // Same CSS as operator label
            layout.getChildren().add(stratLabel);
        }
    
        // Apply the 'mainbg' class to the layout
        layout.getStyleClass().add("mainbg");
        
        Button backButton = new Button("Back to Choose Mode");
        backButton.setOnAction(e -> showOption1(stage)); // Navigate back to the mode selection

        layout.getChildren().add(backButton);

        // Add CSS class to the layout
        layout.getStyleClass().add("root");

        Scene scene = new Scene(layout, 300, 400);
        try {
            String css = getClass().getResource("/styles.css").toExternalForm();
            scene.getStylesheets().add(css);
        } catch (Exception e) {
            System.err.println("Error loading CSS file: " + e.getMessage());
        }

        stage.setScene(scene);
    }

    private void showDefenseOptions(Stage stage) {
        // Get randomized defense operators and strategies
        DefOperatorsStrat defenseData = new DefOperatorsStrat();
        defenseData.DefOperators();
        defenseData.DefStrat();
        List<String> operators = defenseData.getDefOperators();
        List<String> strats = defenseData.getDefStrat();

        Collections.shuffle(operators);
        Collections.shuffle(strats);

        List<String> selectedOperators = operators.subList(0, 5);
        List<String> selectedStrats = strats.subList(0, 2);

        // Create layout for displaying selected options
        VBox layout = new VBox(15);
        layout.setAlignment(Pos.CENTER);
        Label title = new Label("Defense Operators and Strategies:");
        title.getStyleClass().add("title-label"); // Add a CSS class for title label
        layout.getChildren().add(title);
       
        for (String operator : selectedOperators) {
            Label operatorLabel = new Label(operator);
            operatorLabel.getStyleClass().add("operator-label"); // CSS class for operator labels
            layout.getChildren().add(operatorLabel);
        }
    
        for (String strat : selectedStrats) {
            Label stratLabel = new Label(strat);
            stratLabel.getStyleClass().add("operator-label"); // Same CSS as operator label
            layout.getChildren().add(stratLabel);
        }
    
        // Apply the 'mainbg' class to the layout
        layout.getStyleClass().add("mainbg");
        
        Button backButton = new Button("Back to Choose Mode");
        backButton.setOnAction(e -> showOption1(stage)); // Navigate back to the mode selection

        layout.getChildren().add(backButton);

        // Add CSS class to the layout
        layout.getStyleClass().add("root");

        Scene scene = new Scene(layout, 300, 400);
        try {
            String css = getClass().getResource("/styles.css").toExternalForm();
            scene.getStylesheets().add(css);
        } catch (Exception e) {
            System.err.println("Error loading CSS file: " + e.getMessage());
        }

        stage.setScene(scene);
    }

    private void showOption2(Stage stage) {
        // Create layout for Option 2
        VBox layout2 = new VBox(20);
        layout2.setAlignment(Pos.CENTER); // Center the back button
        Button backButton = new Button("Back to Title Page");
        backButton.setOnAction(e -> start(stage)); // Navigate back to the title page

        layout2.getChildren().add(backButton);

        // Add CSS class to the layout
        layout2.getStyleClass().add("root");

        Scene scene2 = new Scene(layout2, 300, 200);
        try {
            String css = getClass().getResource("/styles.css").toExternalForm();
            scene2.getStylesheets().add(css);
        } catch (Exception e) {
            System.err.println("Error loading CSS file: " + e.getMessage());
        }

        stage.setScene(scene2);
    }
}

