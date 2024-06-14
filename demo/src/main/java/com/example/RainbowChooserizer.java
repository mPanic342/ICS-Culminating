package com.example;

import java.util.Collections;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RainbowChooserizer extends Application {

    private static final String BACKGROUND_IMAGE_URL = "https://wallpaperswide.com/download/tom_clancys_rainbow_six_siege-wallpaper-1440x1080.jpg";
    private static final String CSS_FILE = "/styles.css";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Rainbow Chooserizer");

        // Setting image for ranked
        Image rankedImg = new Image("https://fbi.cults3d.com/uploaders/20470091/illustration-file/4a3bc3b5-3a54-4c8d-bdfa-0232fc950341/Rainbow-Six-Symbol.png");
        ImageView rview = new ImageView(rankedImg);
        rview.setFitHeight(80);
        rview.setPreserveRatio(true);

        // Setting image for goofy
        Image goofyImg = new Image("https://static.vecteezy.com/system/resources/previews/027/460/355/original/coming-soon-label-on-a-transparent-background-free-png.png");
        ImageView gview = new ImageView(goofyImg);
        gview.setFitHeight(80);
        gview.setPreserveRatio(true);

        // Create buttons for navigation
        Button button1 = new Button("Ranked Mode");
        Button button2 = new Button("Goofy Fun Mode");

        // Set actions for buttons
        button1.setOnAction(e -> showOption1(primaryStage));
        button2.setOnAction(e -> showOption2(primaryStage));

        // Setting images to buttons
        button1.setGraphic(rview);
        button2.setGraphic(gview);

        // Layout for title page
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(button1, button2);

        // Add CSS class to the layout
        layout.getStyleClass().add("root");

        // Load CSS and set background image
        Scene scene = new Scene(layout, 800, 600);
        loadStyles(scene);
        setBackgroundImage(layout);
        primaryStage.setScene(scene);
        primaryStage.show();

        Image iconImage = new Image("https://i.pinimg.com/736x/8c/c4/92/8cc492be438c76b99371d691d23cff8f.jpg"); 
        primaryStage.getIcons().add(iconImage);
        primaryStage.show();
    }

    private void showOption1(Stage stage) {
        VBox layout1 = new VBox(20);
        layout1.setAlignment(Pos.CENTER);
        Button attackButton = new Button("Attack");
        Button defenseButton = new Button("Defense");
        Button backButton = new Button("Back to Chooserizer");

        attackButton.setOnAction(e -> showAttackOptions(stage));
        defenseButton.setOnAction(e -> showDefenseOptions(stage));
        backButton.setOnAction(e -> start(stage));

        layout1.getChildren().addAll(attackButton, defenseButton, backButton);
        layout1.getStyleClass().add(".title-label, .operator-label");

        Scene scene1 = new Scene(layout1, 800, 600);
        loadStyles(scene1);
        setBackgroundImage(layout1);

        stage.setScene(scene1);
    }

    private void showAttackOptions(Stage stage) {
        AttOperatorsStrat attackData = new AttOperatorsStrat();
        attackData.AttOperators();
        attackData.AttStrat();
        List<String> operators = attackData.getAttOperators();
        List<String> strats = attackData.getAttStrat();

        Collections.shuffle(operators);
        Collections.shuffle(strats);

        List<String> selectedOperators = operators.subList(0, 5);
        List<String> selectedStrats = strats.subList(0, 2);

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        Label title = new Label("Attack Operators and Strategies:");
        title.getStyleClass().add("title-label");
        layout.getChildren().add(title);

        for (String operator : selectedOperators) {
            Label operatorLabel = new Label(operator);
            operatorLabel.getStyleClass().add("operator-label");
            layout.getChildren().add(operatorLabel);
        }

        for (String strat : selectedStrats) {
            Label stratLabel = new Label(strat);
            stratLabel.getStyleClass().add("operator-label");
            layout.getChildren().add(stratLabel);
        }

        Button backButton = new Button("Back to Chooserizer");
        backButton.setOnAction(e -> showOption1(stage));
        layout.getChildren().add(backButton);

        layout.getStyleClass().add(".title-label, .operator-label");

        Scene scene = new Scene(layout, 800, 600);
        loadStyles(scene);
        setBackgroundImage(layout);

        stage.setScene(scene);
    }

    private void showDefenseOptions(Stage stage) {
        DefOperatorsStrat defenseData = new DefOperatorsStrat();
        defenseData.DefOperators();
        defenseData.DefStrat();
        List<String> operators = defenseData.getDefOperators();
        List<String> strats = defenseData.getDefStrat();

        Collections.shuffle(operators);
        Collections.shuffle(strats);

        List<String> selectedOperators = operators.subList(0, 5);
        List<String> selectedStrats = strats.subList(0, 2);

        VBox layout = new VBox(15);
        layout.setAlignment(Pos.CENTER);
        Label title = new Label("Defense Operators and Strategies:");
        title.getStyleClass().add("title-label");
        layout.getChildren().add(title);

        for (String operator : selectedOperators) {
            Label operatorLabel = new Label(operator);
            operatorLabel.getStyleClass().add("operator-label");
            layout.getChildren().add(operatorLabel);
        }

        for (String strat : selectedStrats) {
            Label stratLabel = new Label(strat);
            stratLabel.getStyleClass().add("operator-label");
            layout.getChildren().add(stratLabel);
        }

        Button backButton = new Button("Back to Chooserizer");
        backButton.setOnAction(e -> showOption1(stage));
        layout.getChildren().add(backButton);

        layout.getStyleClass().add(".title-label, .operator-label");

        Scene scene = new Scene(layout, 800, 600);
        loadStyles(scene);
        setBackgroundImage(layout);

        stage.setScene(scene);
    }

    private void showOption2(Stage stage) {
        VBox layout2 = new VBox(15);
        layout2.setAlignment(Pos.CENTER);
        Button backButton = new Button("Back to Chooserizer");
        backButton.setOnAction(e -> start(stage));
        layout2.getChildren().add(backButton);

        layout2.getStyleClass().add(".title-label, .operator-label");

        Scene scene2 = new Scene(layout2, 800, 600);
        loadStyles(scene2);
        setBackgroundImage(layout2);

        stage.setScene(scene2);
    }

    private void loadStyles(Scene scene) {
        try {
            String css = getClass().getResource(CSS_FILE).toExternalForm();
            scene.getStylesheets().add(css);
        } catch (Exception e) {
            System.err.println("Error loading CSS file: " + e.getMessage());
        }
    }

    private void setBackgroundImage(VBox layout) {
        Image backgroundImage = new Image(BACKGROUND_IMAGE_URL);
        BackgroundImage bgImage = new BackgroundImage(
            backgroundImage,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false)
        );
        layout.setBackground(new Background(bgImage));
    }
}
