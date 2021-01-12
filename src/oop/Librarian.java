package oop;

public class Librarian extends Manager {
	public void saveBook() {
		System.out.println("Saved book in.");
	}

	public void updateBook() {
		System.out.println("Updated book in.");
	}

	// Polymophrism test
	public void printRoleName() {
		System.out.println("Role librarian");
	}
}
