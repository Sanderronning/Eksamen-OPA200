package view;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import view.homeView;


public class logInView {

	private final Stage stage;
	
	public logInView(Stage stage) {
		this.stage = stage;
	}
	
	public void show() {
		Label title = new Label("Administrator Login");
		
		TextField usernameField = new TextField();
		usernameField.setPromptText("Username");
		
		TextField passwordField = new PasswordField();
		passwordField.setPromptText("Password");
		
		Label message = new Label();
		
		Button loginButton = new Button("Log In");
		loginButton.setPrefWidth(100);
		
		loginButton.setOnAction(e -> {
			String username = usernameField.getText();
			String password = passwordField.getText();
			
		if (username.equals("admin") && password.equals("1234")) {
			message.setText("Login successful!");
			new homeView(stage).show(); //viser hjemmesiden
		} else {
			message.setText("Invalid username or password!");
			message.setStyle("-fx-text-fill: red;"); // Rød tekst for feil
		}		
	});
		
		VBox layout = new VBox(15, title, usernameField, passwordField, loginButton, message);
		layout.setAlignment(Pos.CENTER);
		layout.setStyle("-fx-padding: 20;"); // Legger til padding rundt layouten
		
		Scene scene =new Scene(layout, 400, 300);
		stage.setTitle("Log In");
		stage.setScene(scene);
		stage.show();
	}
}
