package view;

import controller.subjectController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.subject;

public class subjectView {

	private final Stage stage;
	private final subjectController controller = new subjectController(); 

	
	public subjectView(Stage stage) {
		this.stage = stage;
		
	}
	
	public void show() {
		// Title label
		Label title = new Label("Subjects");	
		title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
		
		
		//ListView 
		ListView<subject> subjectListView = new ListView<>();
	    subjectListView.setPrefHeight(350);
	    subjectListView.setItems(controller.getAllSubjects()); //Get subjects from controller
		
	    
	    subjectListView.setCellFactory(listView -> new ListCell<subject>() {
            @Override
            protected void updateItem(subject s, boolean empty) {
                super.updateItem(s, empty);
                if (empty || s == null) {
                    setText(null);
                } else {
                    setText(s.getSubjectID() + " - " + s.getSubjectName() + " (" + s.getCredits() + "credits)");
                }
             }
	   });
                
                
	    // Bind the subjects list to the ListView
	    TextField subjectNameField = new TextField();
	    subjectNameField.setPromptText("Subject Name");
	    subjectNameField.setPrefWidth(200);
	    
	    
	    // Add Subject button
	    Button addButton = new Button("Add Subject");
	    addButton.setOnAction(e -> {
	    	String newSubject = subjectNameField.getText().trim();
	    	if (!newSubject.isEmpty()) {
	    		controller.addSubject("S" + (controller.getAllSubjects().size() + 1), newSubject, 7.5); // Default credits to 7.5
	    	} else {
	    		showAlert("Please enter a subject name before adding.");
	    	}
	    });
	    
	    
	    // Delete Subject button
	    Button deleteButton = new Button("Delete Selected Subject");
	    deleteButton.setOnAction(e -> {
	    subject selectedSubject = subjectListView.getSelectionModel().getSelectedItem();
	    	if (selectedSubject != null) {
	    		boolean confirmed = showConfirmation("Are you sure you want to delete the subject: " + selectedSubject + "?");
	    		if (confirmed) {
	    			controller.deleteSubject(selectedSubject);
	    		}
	    	}
	    	});
	    
	    // Disable delete button if no subject is selected
	    deleteButton.disableProperty().bind(subjectListView.getSelectionModel().selectedItemProperty().isNull());

	    // Input box for adding new subjects
	    HBox inputBox = new HBox(10, subjectNameField, addButton, deleteButton);
	    inputBox.setAlignment(Pos.CENTER);
	    inputBox.setPadding(new Insets(10));
	    
	    
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
	
	    // Shows confirmation dialog
	    private boolean showConfirmation(String message) {
		Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
		confirm.setTitle("Confirm Deletion");
		confirm.setHeaderText("Please confirm your action");
		confirm.setContentText(message);
		
		//Return true if user clicks OK, false otherwise
		return confirm.showAndWait().filter(response -> response == ButtonType.OK).isPresent();
	    }
}
