package oop;

public class Manager extends User {

	// Polymophrism test
	public void printRoleName() {
		System.out.println("Role manager");
	}

	public void saveBook() {
		System.out.println("Saved book in.");
	}

	public void updateBook() {
		System.out.println("Updated book in.");
	}
}
