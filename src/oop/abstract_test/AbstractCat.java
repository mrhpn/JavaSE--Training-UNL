package oop.abstract_test;

public class AbstractCat {

	public static void main(String[] args) {
		// Animal animal = new Animal(); // can't instancitate abstract class
		
		// available constructors
		Animal cat = new Cat("White");
		cat.makeSound();
		System.out.println(cat.getColor());
		
		// concert methods (which has implementation details)
		cat.isFatAnimal(90);
		
		// available getters and setters
		cat.setColor("yellow");
		System.out.println(cat.getColor());
	
		Owner catOwner = new Cat("Brown"); // polymorphism
		System.out.println(catOwner.ownerName()); // calling interface's methods
	}
	
	

}
