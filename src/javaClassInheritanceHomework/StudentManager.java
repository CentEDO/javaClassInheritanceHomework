package javaClassInheritanceHomework;

public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println(student.getFirstName() + " " +student.getLastName() + " enrolled as a student!");
	}
}
