package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class subjectView {

	private final Stage stage;
	private final ObservableList<String> subjects = FXCollections.observableArrayList(
			"Mathematics", "Physics", "Chemistry", "Biology", "History"
			);
	
	public subjectView(Stage stage) {
		this.stage = stage;
		
		//Sample data
		subjects.addAll("Mathematics", "Physics", "Chemistry", "Biology", "History");
	}
	
	public void show() {
		// Title label
		Label title = new Label("Subjects");	
		title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
		
		// ListView to display subjects
		ListView<String> subjectListView = new ListView<>();
	    subjectListView.setPrefHeight(350);
	    subjectListView.setItems(subjects);
	    
	    // Bind the subjects list to the ListView
	    TextField subjectNameField = new TextField();
	    subjectNameField.setPromptText("Subject Name");
	    subjectNameField.setPrefWidth(200);
	    
	    // Add Subject button
	    Button addButton = new Button("Add Subject");
	    addButton.setOnAction(e -> {
	    	String newSubject = subjectNameField.getText().trim();
	    	if (!newSubject.isEmpty()) {
	    		subjects.add(newSubject);
	    		subjectNameField.clear();
	    	} else {
	    		showAlert("Please enter a subject name before adding.");
	    	}
	    });
	    
	    
	    // Input box for adding new subjects
	    HBox inputBox = new HBox(10, subjectNameField, addButton);
	    inputBox.setAlignment(Pos.CENTER);
	    inputBox.setStyle("-fx-padding: 10;");
	    
	    // Back to Home Page button
	    Button backButton = new Button("Back to Home Page");
	    backButton.setOnAction(e -> new homeView(stage).show());
	    
	    // Main layout
	    VBox layout = new VBox(15, title, subjectListView, inputBox, backButton);
	    layout.setPadding(new Insets (20));
	    layout.setAlignment(Pos.CENTER);
	    
	    // Scene setup
	    Scene scene = new Scene(layout, 600, 500);
	    stage.setTitle("Subject Management");
	    stage.setScene(scene);
	    stage.show();
	    
	}
	   
		// Shows alert message
	    private void showAlert(String message) {
	    	Alert alert = new Alert (Alert.AlertType.WARNING);
	    	alert.setHeaderText(null);
	    	alert.setContentText(message);
	    	alert.showAndWait();
	    }
	
	
	
}
