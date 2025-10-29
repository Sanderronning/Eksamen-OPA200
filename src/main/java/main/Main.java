
package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Laster login.fxml fra resources/view
        	System.out.println("Prøver å laste: " + getClass().getResource("/view/login.fxml"));
        	Parent root = FXMLLoader.load(getClass().getResource("/view/login.fxml"));


            primaryStage.setTitle("University Login");
            primaryStage.setScene(new Scene(root, 400, 300));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

