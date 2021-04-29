package javaClassInheritanceHomework;

public class Student extends User{
	
	
	public Student() {}
	
	public Student(int id, String firstName, String lastName, String eMail, 
			String password, int completingPercentage) {
		super(id, firstName, lastName, eMail, password, completingPercentage);	
	} 
}
