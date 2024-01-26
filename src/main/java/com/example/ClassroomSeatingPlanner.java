package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main application class for the Classroom Seating Chart.
 * It loads the primary FXML layout and sets up the main stage.
 */
public class ClassroomSeatingPlanner extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("primary.fxml"));
        Parent root = loader.load();

        // Retrieve the controller
        PrimaryController controller = loader.getController();

        Scene scene = new Scene(root);

        // Set up the stage
        primaryStage.setTitle("Classroom Seating Chart");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
