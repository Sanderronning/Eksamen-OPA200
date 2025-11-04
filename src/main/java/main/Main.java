package main;

import javafx.application.Application;
import javafx.stage.Stage;
import view.logInView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        logInView login = new logInView(primaryStage);
        login.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
