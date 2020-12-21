package assignments;

import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double firstNumber = input.nextDouble();
		
		System.out.println("Enter second number: ");
		double secondNumber = input.nextDouble();
		
		System.out.println("Sum: " + sum(firstNumber, secondNumber));
		System.out.println("Substract: " + substract(firstNumber, secondNumber));
		System.out.println("Multiply: " + multiply(firstNumber, secondNumber));
		System.out.println("Divide: " + divide(firstNumber, secondNumber));
		System.out.println("Mod: " + mod(firstNumber, secondNumber));
	}
	
	private static double sum(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	private static double substract(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	private static double multiply(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	private static double divide(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	private static double mod(double firstNumber, double secondNumber) {
		return firstNumber % secondNumber;
	}
}
