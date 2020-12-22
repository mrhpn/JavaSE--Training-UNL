package basics;

public class Vehicle {
	int price;
	String model;
	String color;
	
	public Vehicle(int price, String model, String color) {
		this(color);
		this.price = price;
	}
	
	public Vehicle(String color) {
		this.color = color;
	}
	
	public Vehicle() {
		System.out.println("Zero Args Constructor");
	}
	
	boolean updateColor(String color) {
		this.color = color;
		return true;
	}
}
