package oop.abstract_test;

// This is abstract sub class of abstract animal class. 
// Don't force to override parents abstract methods because child is also abstract.
// But can abstract on some purpose.
public abstract class ColdBloodedAnimal extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Cold blooded's voice");
	}
}
