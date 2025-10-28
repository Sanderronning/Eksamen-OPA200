package model;

public abstract class person {
	
	protected String personID;
	protected String firstName;
	protected String lastName;
	protected String email;
	
	public person(String personID, String firstName, String lastName, String email) {
		this.personID = personID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
public String getFullName() {
	return firstName + "" + lastName;
}
}
