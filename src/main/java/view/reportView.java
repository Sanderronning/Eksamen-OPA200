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
	
	private final Stage stage;
	private final Control subjectComboBox;
	private final Control selectSubjectButton;


	public void start(Stage stage) { // the method inheritance from the build in class application
		ComboBox<String> subjectComboBox = new ComboBox <>();  // defines a new subject comboBox
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

	public void show() {
		// Title label
		Label title = new Label("Report");	
		title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
	
	// Main layout
		VBox layout = new VBox(15, title, subjectComboBox, selectSubjectButton ); // må sjekke at denne layouten blir riktig
		layout.setPadding(new Insets (20));
		layout.setAlignment(Pos.CENTER);
		
	// Scene setup
		Scene scene = new Scene(layout, 600, 500); // må sjekke om denne layouten blir riktig 
		stage.setTitle("Report Management");
		stage.setScene(scene);
		stage.show();
    
	}
}
