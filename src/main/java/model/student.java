package model;

public class student extends user {

	private String studentID;
	private String subject;
	
	public student(String studentID, String subject, String firstName, String lastName, String email) {
		super(firstName, lastName, email);
		this.studentID = studentID;
		this.subject = subject;
	}
}

//Getters and Setters
