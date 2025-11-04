package model;

public class administrator extends user {
	
	private String adminID;
	private String username;
	private String password;

	public administrator(String firstName, String lastName, String email, 
		String adminID, String username, String password) {
		super( firstName, lastName, email);
		this.adminID = adminID;
		this.username = username;
		this.password = password;
		
	}
	public boolean login(String username, String password) {
		return this.username.equals(username) && this.password.equals(password);
	}
	public void manageUsers() {
		System.out.println("Managing users...");
	}
	//Getters and Setters
	public String getAdminID() {return adminID;}
	public String getUsername() {return username;}
	public String getPassword() {return password;}

}
