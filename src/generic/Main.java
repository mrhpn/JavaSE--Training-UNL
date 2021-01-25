package generic;

import oop.Admin;
import oop.abstract_test.Animal;
import oop.abstract_test.Cat;
import oop.abstract_test.Dog;

public class Main {

	/**
	 * 
	 * Benefits
	 * --------
	 * 1. Type Safety
	 * 2. Avoid Type Casting Problem
	 * 
	 * Generic Class
	 * -------------
	 * 1. UnBoundedType Parameter (can pass any type of parameter)
	 * 		public class Test<T> {}
	 * 2. BoundedType Parameter
	 * 		public class Test<T extends Animal> {}
	 * 
	 * Generic Method
	 * --------------
	 * 1. UnBoundedType Parameter
	 * 2. BoundedType Parameter
	 */
	public static void main(String[] args) {
		
		// Generic Bounded Method Test
		//----------------------------
		Integer[] intArray = {1, 2, 3, 4, 5};
		printArray(intArray);
		
		String[] stringArray = {"Tulips", "Rose", "Gandamar"};
		printArray(stringArray);
		
		// Generic Bounded Class Test
		//---------------------------
		AnimalBox<Animal> catBox = new AnimalBox<Animal>();
		catBox.add(new Cat("Yellow"));
		catBox.get().makeSound();
		
		/*
		 * Generic UnBounded Class Test
		 * ----------------------------
		 * Box<Integer> integerBox = new Box<Integer>(); integerBox.add(100);
		 * System.out.printf("Integer Box value is %d\n", integerBox.get());
		 * 
		 * Box<String> stringBox = new Box<String>(); stringBox.add("Apple");
		 * System.out.printf("String Box value is %s\n", stringBox.get());
		 * 
		 * Box<Double> doubleBox = new Box<Double>(); doubleBox.add(1.9);
		 * System.out.printf("Double Box value is %s\n", doubleBox.get());
		 * 
		 * Box<Admin> adminBox = new Box<Admin>(); adminBox.add(new Admin());
		 * adminBox.get().printRoleName();
		 */
	}
	
	public static <E> void printArray(E[] elements) {
		for(E element : elements) {
			System.out.print(element + " ");
		}
	}

}
