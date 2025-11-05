package controller;

import model.subject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import view.subjectView; 

public class subjectController {
	
	private final ObservableList<subject> subjectList = FXCollections.observableArrayList();
	
	
    public subjectController() {
        subjectList.addAll(
                new subject("S1", "Mathematics", 7.5),
                new subject("S2", "Physics", 5.0),
                new subject("S3", "Chemistry", 6.0),
                new subject("S4", "Biology", 7.5),
                new subject("S5", "History", 5.0)
        );
    }
	
	//Get all subjects
	public ObservableList<subject> getAllSubjects() {
		return subjectList; 
	}
	
	//Add subject
		public void addSubject(String subjectID, String subjectName, double credits) {
		    subjectList.add(new subject(subjectID, subjectName, credits));
		}

	
	
	public void deleteSubject(subject subject) {
		subjectList.remove(subject); 
	}
	

}
