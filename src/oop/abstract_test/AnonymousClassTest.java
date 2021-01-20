package oop.abstract_test;

public class AnonymousClassTest {

	public static void main(String[] args) {
		Machine m1 = new Machine() {

			@Override
			public void powerOn() {
				System.out.println("M 1 is on.");
			}
			
		};
		
		m1.powerOn();
		
		Machine m2 = new Machine() {
			@Override
			public void powerOn() {
				System.out.println("M 2 is On.");
			}
		};
		
		m2.powerOn();
		
		Animal horse = new Animal() {

			@Override
			public void makeSound() {
				System.out.println("HEEEEE HEEEEE");
			}
		};
		
		horse.makeSound();
	}

}
