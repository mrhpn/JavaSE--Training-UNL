package basics;

import java.util.Scanner;

/**
 * Accepting user inputs
 * @author Htet Phyo Naing
 *
 */
public class UserInput {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Your First Number: ");
		double firstNumber = userInput.nextDouble();
		
        System.out.println("Enter Your Second Number: ");
		double secondNumber = userInput.nextDouble();
		
		System.out.println(firstNumber + secondNumber);
		System.out.println(firstNumber - secondNumber);
		System.out.println(firstNumber * secondNumber);
		System.out.println(firstNumber / secondNumber);
		System.out.println(firstNumber % secondNumber);
	}

}
