package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


	public class reportView {
	
		private Stage stage = new Stage();

	public reportView(Stage stage) {
		this.stage = stage;
	}
		
	public void subjectOption(Stage stage) { //
		ComboBox<String> subjectComboBox = new ComboBox <>();  // defines a new subject-comboBox
		subjectComboBox.setPromptText("Choose a subject"); // sets the text for the comboBox, so that the user understands the function of the comboBox
		subjectComboBox.setItems (FXCollections.observableArrayList(
		"Mathematics", "Physics", "Chemistry", "Biology", "History"
		)); //FXCollections is a build in class that makes it possible to notice changes that are made in the list
	
		Button selectSubjectButton = new Button ("Show subject"); //The button to press after selecting it form the comboBox
		selectSubjectButton.setOnAction(e -> {
		String selected = subjectComboBox.getValue();
		System.out.println(selected != null ? "The subject is: " + selected : "You have to choose a subject");
		});
		}	
	public void examOption(Stage stage) { // 
		ComboBox<String> examComboBox = new ComboBox <>();  // defines a new exam-comboBox
		examComboBox.setPromptText("Choose an exam"); // sets the text for the comboBox, so that the user understands the function of the comboBox
		examComboBox.setItems (FXCollections.observableArrayList(
		"2023-Autumn","2024-Spring", "2024-Autumn", "2025-Spring", "2025-Autum"
		)); //FXCollections is a build in class that makes it possible to notice changes that are made in the list

		Button selectExamButton = new Button ("Show exam"); //The button to press after selecting it form the comboBox
		selectExamButton.setOnAction(e -> {
		String selected = examComboBox.getValue();
		System.out.println(selected != null ? "The exam is: " + selected : "You have to choose an exam");
		});
		}	
	
	public void show() {
		// Title label
		Label title = new Label("Report");	
		title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
	
	// Main layout
		VBox layout = new VBox(15, title ); // må sjekke at denne layouten blir riktig
		layout.setPadding(new Insets (20));
		layout.setAlignment(Pos.CENTER);
		
	// Scene setup
		Scene scene = new Scene(layout, 600, 500); // må sjekke om denne layouten blir riktig 
		stage.setTitle("Report Management");
		stage.setScene(scene);
		stage.show();
    
	}
}
