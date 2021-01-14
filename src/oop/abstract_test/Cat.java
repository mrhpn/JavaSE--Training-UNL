package oop.abstract_test;

public class Cat extends Animal implements Owner {

	public Cat(String color) {
		super(color);
	}

	public static void main(String[] args) {
		

	}

	@Override
	public void makeSound() {
		System.out.println("Meow Meow");
	}

	// Owner interface's methods START -----
	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return "Mg Mg";
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String petRegistrationNo() {
		// TODO Auto-generated method stub
		return null;
	}
	// Owner interface's methods END -----

}
