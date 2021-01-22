package assignment_6_1;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * General purpose class used when reading inputs from the console
 * 
 * Used concepts: 
 * -------------- 
 * - Encapsulation 
 * - Abstraction 
 * - Method Overloading 
 * - Exception Handling
 * 
 * @author Htet Phyo Naing
 *
 */
public class Console {
	private static Scanner scanner = new Scanner(System.in);

	public static double readNumber(String prompt, double min, double max) {
		double value = 0;

		while (value <= 0) {
			try {
				System.out.print(prompt);
				value = scanner.nextDouble();
			} catch (InputMismatchException e) {
				// converting printStackTrace to String
				StringWriter stringWriter = new StringWriter();
				e.printStackTrace(new PrintWriter(stringWriter));
				String errorMessage = stringWriter.toString();
				
				// logging printStackTrack to log file
				Logger logger = new Logger(errorMessage);
				logger.log();
				
				System.out.print("Invalid input! ");
			}
			scanner.nextLine();

			if (value >= min && value <= max) break;
			System.out.println("Enter a value between " + min + " and " + max);
		}
		return value;
	}

	public static double readNumber(String prompt) {
		return scanner.nextDouble();
	}
}
