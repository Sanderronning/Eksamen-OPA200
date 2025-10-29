package model;

public abstract class person {
	
	protected String firstName;
	protected String lastName;
	protected String email;
	
	public person(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
public String getFullName() {
	return firstName + "" + lastName;
}
}
