package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import util.average;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


	public class reportView {
	
		private Stage stage = new Stage();

	public reportView(Stage stage) {
		this.stage = stage;
	}
	
	
	public void show() {
		// Title label
		Label title = new Label("Report");	
		title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
		
		// ComboBox for the subjects
		ComboBox<String> subjectComboBox = new ComboBox <>();  // defines a new subject-comboBox
		subjectComboBox.setPromptText("Choose a subject"); // sets the text for the comboBox, so that the user understands the function of the comboBox
		subjectComboBox.setItems (FXCollections.observableArrayList(
		"Mathematics", "Physics", "Chemistry", "Biology", "History"
		)); //FXCollections is a build in class that makes it possible to notice changes that are made in the list
		
		// Label (text) for selecting a subject and pressing the button
		Label selectSubject = new Label ("Select a subject and press the button");
		
		// button for showing the subject
		Button selectSubjectButton = new Button ("Show subject"); //The button to press after selecting it form the comboBox
		selectSubjectButton.setOnAction(e -> {
		String selected = subjectComboBox.getValue();
		if (selected != null) {
		selectSubject.setText("The subject is: " + selected);
		} else { 
	    selectSubject.setText ("You have to select a subject");
		}
		});
		
		// ComboBox for the exams
		ComboBox<String> examComboBox = new ComboBox <>();  // defines a new exam-comboBox
		examComboBox.setPromptText("Choose an exam"); // sets the text for the comboBox, so that the user understands the function of the comboBox
		examComboBox.setItems (FXCollections.observableArrayList(
		"2023-Autumn","2024-Spring", "2024-Autumn", "2025-Spring", "2025-Autum"
		)); //FXCollections is a build in class that makes it possible to notice changes that are made in the list
		
		
		// The label (text) for selecting an exam and pressing the button 
		Label selectExam = new Label ("Selcet a exam and press the button");
		
		//button for showing the selected exam
		Button selectExamButton = new Button ("Show exam"); //The button to press after selecting it form the comboBox
		selectExamButton.setOnAction(e -> {
		String selected = examComboBox.getValue();
		if (selected != null) {
		selectExam.setText ("The exam is: " + selected); 
		} else {
		selectExam.setText("You have to select a exam");
		}
		});
		
		//a object of the class average
		average av = new average();
		
		// label (text) for calculate average grade for the exam
		Label selectAverageLabel = new Label ("Press the generate average grade for get the average grade for the seleced exam");
		
		//button for calculating average grade with example data
		Button generateAverageButton = new Button ("Generate average grade");
		generateAverageButton.setOnAction(e -> {
		double [] grade = {5, 6, 6, 4, 2, 3};
		double resultAverage = av.calculateAverage(grade);
		selectAverageLabel.setText("The average grade for the exam is: " + resultAverage);
		}
		);
		
		//label (text) for generating a report of the average grade
		Label selectReportLabel = new Label ("Press the button to generate a report of the average grade");
		
		// button for generating a report
		Button generateReportButton = new Button ("Generate a report");
		generateReportButton.setOnAction(e -> {
		selectReportLabel.setText("Confirmation, the report is saved");
		});
		
	    // Main layout
		VBox layout = new VBox(15, title, subjectComboBox, selectSubject, selectSubjectButton, examComboBox, selectExam, selectExamButton, selectAverageLabel, generateAverageButton, selectReportLabel, generateReportButton); // må sjekke at denne layouten blir riktig
		layout.setPadding(new Insets (20));
		layout.setAlignment(Pos.CENTER);
		
		
	    // Scene setup
		Scene scene = new Scene(layout, 600, 500); // må sjekke om denne layouten blir riktig 
		stage.setTitle("Report Management");
		stage.setScene(scene);
		stage.show();
		
		// The scene for showing selected exam
		stage.setScene(scene);
		stage.setTitle("ComboBox value exam");
		stage.show();
		
		// The scene for showing selected exam
		stage.setScene(scene);
		stage.setTitle("ComboBox value subject");
		stage.show();
	}
}
