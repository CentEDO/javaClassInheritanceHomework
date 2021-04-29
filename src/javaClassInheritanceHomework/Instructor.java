package javaClassInheritanceHomework;

public class Instructor extends User {
	private String bio;
	
	
	public Instructor() {}
	
	public Instructor(String bio) {
		this.bio = bio;
		
	}
	public Instructor(int id, String firstName, String lastName, String eMail, 
			String password, int completingPercentage) {
		super(id, firstName, lastName, eMail, password, completingPercentage);
		
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
}
