package javaClassInheritanceHomework;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " is added!");
	}
	public void remove(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " is removed!");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " is updated!");
	}
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}
}
