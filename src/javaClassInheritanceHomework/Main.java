package javaClassInheritanceHomework;

public class Main {

	public static void main(String[] args) {

			Student student1 = new Student();
			student1.setFirstName("Edvin");
			student1.setLastName("Davulcu");
			student1.seteMail("edvin@edvin.com");
			student1.setCompletingPercentage(41);
			student1.setId(1);
			student1.setPassword("edvin123");
			
			
			Instructor instructor1 = new Instructor();
			instructor1.seteMail("engin@engin.com");
			instructor1.setFirstName("Engin");
			instructor1.setLastName("Demiroğ");
			instructor1.setCompletingPercentage(99);
			instructor1.setId(2);
			instructor1.setPassword("engin123");
			
			User[] users = new User[] {student1,instructor1};
			
			UserManager userManager = new UserManager();
			userManager.addMultiple(users);
			
			StudentManager studentManager = new StudentManager();
			studentManager.add(student1);
			
			InstructorManager instructorManager = new InstructorManager();
			instructorManager.add(instructor1);
			
			
			
			
	}

}
