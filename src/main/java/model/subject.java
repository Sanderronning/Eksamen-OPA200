package model;

public class subject {
	
	private String subjectID;
	private String subjectName;
	private double credits;
	
	public subject(String subjectID, String subjectName, double credits) {
		this.subjectID = subjectID;
		this.subjectName =subjectName;
		this.credits = credits;
	}
	
	//Getters and Setters
	public String getSubjectID() {
		return subjectID;
	}
	
	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public double getCredits() {
		return credits;
	}
	
	public void setCredits(double credits) {
		this.credits = credits;
	}

	public static void add(subject subject) {	
		
	}
	
	@Override 
	public String toString() {
		return subjectName;
	}
}
