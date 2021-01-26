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
		
		// max
		System.out.printf("Max Value of %d, %d, %d, %d is %d ", 20, 30, 39, 40, max(20, 40, 30, 50));
		System.out.println();
		System.out.printf("Max Value of %s, %s, %s, %s is %s ", "orange", "apple", "banana", "mango", max("orange", "apple", "banana", "mango"));
		System.out.println();
		
		// min
		System.out.printf("Min Value of %d, %d, %d, %d is %d ", 20, 30, 39, 40, min(20, 40, 30, 50));
		System.out.println();
		
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
	
	public static <T extends Comparable<T>> T max(T x, T y, T w, T z) {
		T max = x;
		
		if (y.compareTo(max) > 0) {
			max = y;
		}
		
		if (w.compareTo(max) > 0) {
			max = w;
		}
		
		if (z.compareTo(max) > 0) {
			max = z;
		}
		
		return max;
	}
	
	public static <T extends Comparable<T>> T min(T x, T y, T w, T z) {
		T min = x;
		
		if (y.compareTo(min) < 0) {
			min = y;
		}
		
		if (w.compareTo(min) < 0) {
			min = w;
		}
		
		if (z.compareTo(min) < 0) {
			min = z;
		}
		
		return min;
	}

}
