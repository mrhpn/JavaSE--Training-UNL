package oop.abstract_test;

public class Cat extends Animal implements Owner, Cloneable {

	public Cat(String color) {
		super(color);
	}
	
	@Override
	protected Owner clone() throws CloneNotSupportedException {
		return (Owner) super.clone();
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
