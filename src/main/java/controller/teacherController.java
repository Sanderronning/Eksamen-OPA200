packeg controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import dao.teacherDao;
import model.teacher;

public class teacherController{
	@FXML private TextField nameField;
    @FXML private TextField emailField;
    @FXML private TextField courseField;
    @FXML private TextField tlfNrField;
    @FXML private Label statusLabel;
    
    private teacherDao teacherDao = new teacherDao();
    
    @FXML
    private void registerTeacher() {
    	String name = nameField.getText();
    	String email = emailField.getText();
        String course = courseField.getText();
        String tlfNr = tlfNrField.getText();
        
        if (name == null || name.trim().isEmpty() || email == null || email.trim().isEmpty()){
            statusLabel.setText("Name and Email are required!");
            return;
        }
        
        teacher teacher = new teacher(name, email, course, tlfNr);
        teacherDao.registerTeacher(teacher);

        statusLabel.setText("Teacher registered successfully!");
        clearFields();
    }

    private void clearFields() {
        nameField.clear();
        emailField.clear();
        courseField.clear();
        tlfNrField.clear();
    }
}

