package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.*; 


public class homeView {
	private final Stage stage;
	private final List<String> students = new ArrayList<>();
	private final List<String> teachers = new ArrayList<>();
	private final Map<String, Double> reports = new HashMap<>(); // Map for student reports
	
	public homeView(Stage stage) {
		this.stage = stage;
		
		// Sample data
		students.addAll(Arrays.asList("Ola Nordmann", "Kari Nordmann", "Per Hansen"));
		teachers.addAll(Arrays.asList("Lars Lærer", "Eva Underviser"));
		reports.put("Average Grade", 5.6);
		
	}
	
	public void show() {
		Label title = new Label("Home Page");
		title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
		
		Region spacer = new Region(); // Spacer for better layout
		
		HBox.setHgrow(spacer, Priority.ALWAYS);
		
		// Logout button
		Button logoutButton = new Button("Log Out");
		logoutButton.setOnAction(e -> new logInView(stage).show());
		
		// Top bar layout
		HBox topBar = new HBox(10, title, spacer, logoutButton);
		topBar.setPadding(new Insets(15));
		topBar.setAlignment(Pos.CENTER_LEFT);
		topBar.setStyle("-fx-background-color: #2e86de;");
		
		// Welcome label
		Label welcome = new Label("Welcome to the Home Page!");
		welcome.setStyle("-fx-font-size: 18px;");
		
		   // --- Center content ---
        Label welcomeLabel = new Label("Welcome to the Administrator Home Page!");
        welcomeLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

   
        // Subject section
        Button subjectButton = new Button ("Manage Subjects");
        subjectButton.setPrefWidth(200);
        subjectButton.setOnAction(e -> new subjectView(stage).show());
        
        VBox centerContent = new VBox(20, welcomeLabel, subjectButton);
        centerContent.setAlignment(Pos.CENTER);
        
        BorderPane root = new BorderPane();
        root.setTop(topBar);
        root.setCenter(centerContent);
        root.setPadding(new Insets(40));

     

        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Administrator Dashboard");
        stage.setScene(scene);
        stage.show();
		
	}
	
}
