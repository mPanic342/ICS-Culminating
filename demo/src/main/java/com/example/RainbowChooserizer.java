package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RainbowChooserizer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Rainbow Chooserizer");

        // Create buttons for navigation
        Button button1 = new Button("Option 1");
        Button button2 = new Button("Option 2");

        // Set actions for buttons
        button1.setOnAction(e -> showOption1(primaryStage));
        button2.setOnAction(e -> showOption2(primaryStage));

        // Layout for title page
        VBox layout = new VBox(20);
        layout.getChildren().addAll(button1, button2);

        // Set the scene and show
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showOption1(Stage stage) {
        // Create layout for Option 1
        VBox layout1 = new VBox(20);
        Button backButton = new Button("Back to Title Page");
        backButton.setOnAction(e -> start(stage)); // Navigate back to the title page

        layout1.getChildren().add(backButton);
        Scene scene1 = new Scene(layout1, 300, 200);
        stage.setScene(scene1);
    }

    private void showOption2(Stage stage) {
        // Create layout for Option 2
        VBox layout2 = new VBox(20);
        Button backButton = new Button("Back to Title Page");
        backButton.setOnAction(e -> start(stage)); // Navigate back to the title page

        layout2.getChildren().add(backButton);
        Scene scene2 = new Scene(layout2, 300, 200);
        stage.setScene(scene2);
    }
}
