package oop;

public class PolymophrismTest {

	/**
	 * Polymophrism
	 * ============
	 * 
	 * 1. compile time polymophrism - method overloading
	 * 2. runtime polymophrism - method overriding
	 *
	 */
	public static void main(String[] args) {
		User user = new User();
		
		User student = new Student();
		
		User librarian = new Librarian();
		
		User manager = new Manager();
		
		User admin = new Admin(); // upcasting
		
		if (admin instanceof Admin)
			((Admin)admin).deleteBook(); // downcasting
		
		PolymophrismTest poly = new PolymophrismTest();
		
		poly.printRoleName(user);
		poly.printRoleName(student);
		poly.printRoleName(librarian);
		poly.printRoleName(manager);
		poly.printRoleName(admin);
	}

	public void printRoleName(User user) {
		user.printRoleName();
	}

}
