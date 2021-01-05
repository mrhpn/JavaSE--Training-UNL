package basics;

public class Vehicle {
	int price;
	String model;
	String color;
	
	{
		System.out.println("Inside instance initializer.");
	}
	
	public Vehicle(int price, String model, String color) {
		// this(color);
		this.price = price;
		System.out.println("Inside 3 Args Constructor");
	}
	
//	public Vehicle(String model, String color, int price) {
//		
//	}
	
	public Vehicle(String color) {
		this.color = color;
		System.out.println("Inside 1 Arg Constructor");
	}
	
	public Vehicle() {
		System.out.println("Inside 0 Arg Constructor.");
	}
	
	boolean updateColor(String color) {
		this.color = color;
		return true;
	}
}
