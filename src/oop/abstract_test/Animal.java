package oop.abstract_test;

public abstract class Animal {
	
	private String color;
	
	public Animal() {
		System.out.println("Inside Animal Constructor...");
	}
	
	public Animal(String color) {
		this.color = color;
	}
	
	public abstract void makeSound();
	
	public void isFatAnimal(int lb) {
		if (lb > 100) System.out.println("FAT!!!");
		System.out.println("NOT FATT!!!");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

