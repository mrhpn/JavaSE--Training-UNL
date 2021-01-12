package oop;

public class Student extends User {
	public Student() {
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println("Inside student constructor.");
	}

	// Polymophrism test
	public void printRoleName() {
		System.out.println("Role student");
	}
}
