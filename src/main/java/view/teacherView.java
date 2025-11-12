package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import controller.teacherController;
import model.teacher;

public class teacherView extends Application {

    private final teacherController controller = new teacherController();

    @Override
    public void start(Stage stage) {
        ComboBox<teacher> teacherDropdown = new ComboBox<>();
        teacherDropdown.setPromptText("Select a teacher...");

        teacherDropdown.setItems(((Object) controller).getAllTeachers());

        teacherDropdown.setConverter(new StringConverter<teacher>() {
            @Override
            public String toString(teacher t) {
                return t != null ? t.getName() : "";
            }

            @Override
            public teacher fromString(String string) {
                return null;
            }
        });

        teacherDropdown.setOnAction(event -> {
            teacher selected = teacherDropdown.getValue();
            if (selected != null) {
                System.out.println("Selected teacher: " + selected.getName());
                System.out.println("Email: " + selected.getEmail());
                System.out.println("Course: " + selected.getCourse());
                System.out.println("TlfNumber: " + selected.getTlfNr());
            }
        });

        VBox layout = new VBox(15, teacherDropdown);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-font-size: 14;");

        Scene scene = new Scene(layout, 400, 200);
        stage.setTitle("Teacher Selector");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
