package javaClassInheritanceHomework;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	private int completingPercentage;
	
	public User() {}
	public User(int id, String firstName, String lastName, String eMail, 
			String password, int completingPercentage) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
		this.completingPercentage = completingPercentage;	
	}
	public int getCompletingPercentage() {
		return completingPercentage;
	}
	public void setCompletingPercentage(int completingPercentage) {
		this.completingPercentage = completingPercentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
