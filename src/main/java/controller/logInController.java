package controller;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import model.administrator;

public class logInController {

	@FXML 
	private TextField usernameField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Label messageLabel;
	
	private administrator admin;
	
	public logInController() {
		//midlertidig administrator
		this.admin = new administrator("Admin", "user", "admin@uni.no", "A1", "admin", "1234");
	}
	
	@FXML
	private void handleLogin(ActionEvent event) {
		String username = usernameField.getText();
		String password = passwordField.getText();
		
		if(admin.login(username, password)) {
			messageLabel.setText("Login successful!");
			loadHomePage();
		}else {
				messageLabel.setText("Invalid username or password.");
			}
		}
		private void loadHomePage() {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/homePage.fxml"));
				Parent root = loader.load();
				Stage stage = (Stage) usernameField.getScene().getWindow();
				stage.setScene(new Scene (root, 800, 600));
				stage.setTitle("Home Page");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} 
	

