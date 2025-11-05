package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.List;
import controller.examController;
public class examView extends Application {

    private final examController controller = new examController();

    @Override
    public void start(Stage stage) {
        // Create dropdown
        ComboBox<String> examDropdown = new ComboBox<>();
        examDropdown.setPromptText("Selecet a course...");

        // get courses from controller
        List<String> courseTitles = controller.getUniqueExamTitles();
        examDropdown.getItems().addAll(courseTitles);

        // when the user selects a course
        examDropdown.setOnAction(event -> {
            String selected = examDropdown.getValue();
            System.out.println("Select course: " + selected);
        });

        // Layout
        VBox layout = new VBox(15);
        layout.getChildren().add(examDropdown);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-font-size: 14;");

        // Scene and stage
        Scene scene = new Scene(layout, 300, 150);
        stage.setTitle("ExamSelecter");
        stage.setScene(scene);
        stage.show();
    }

    
}
