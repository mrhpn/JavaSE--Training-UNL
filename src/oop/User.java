package oop;

public class User {
	public int age = 20;
	protected String name = "Mg Mg";
	private double salary = 200000;
	String phoneNumber = "398493894";
	
	public User() {
		System.out.println("Inside user constructor");
	}
	
	// Polymophrism test
	public void printRoleName() {
		System.out.println("Role user");
	}
	
	public void login() {
		System.out.println("Logged in.");
	}
	
	public void register() {
		System.out.println("Registered.");
	}
	
	public void cart() {
		System.out.println("Added book to cart");
	}
	
	public void logout() {
		System.out.println("Logout in.");
	}
}
