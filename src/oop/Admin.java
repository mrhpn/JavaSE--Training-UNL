package oop;

public class Admin extends Manager {
	public void deleteBook() {
		System.out.println("Deleted book in.");
	}

	// Polymophrism test
	public void printRoleName() {
		System.out.println("Role admin");
	}
}
