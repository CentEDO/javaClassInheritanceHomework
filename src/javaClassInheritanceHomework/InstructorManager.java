package javaClassInheritanceHomework;

public class InstructorManager extends UserManager{
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " "+ instructor.getLastName() +" enrolled as an instructor!");
	}
	public void remove(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " "+ instructor.getLastName() +" removed at instructor list!");
	}
}
