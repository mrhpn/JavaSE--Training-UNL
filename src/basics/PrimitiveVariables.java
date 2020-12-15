package basics;

public class PrimitiveVariables {

	public static void main(String[] args) {
		// hex into int
		int hex = 0x0041;
		System.out.println("Hex Integer Value: " + hex);
		
		// binary to int
		int binary = 0b01000001;
		System.out.println("Binary Integer Value: " + binary);
		
		// character to int
		int character = 'D';
		System.out.println("Char Integer Value: " + character);
		
		// large integer values with underscore
		int underscoreInt = 10_30_2021;
		System.out.println("Underscore Integer Value: " + underscoreInt);
		
		// character
		char character1 = 'B';
		System.out.println("Character: " + character1);
		
		// int to character
		char charInt = 66;
		System.out.println("CharInt: " + charInt);
		
		// unicode to char
		char unicode = '\u0041';
		System.out.println("Unicode: " + unicode);
		
		// hex to char
		char unicode1 = 0x41;
		System.out.println("Hex to char: " + unicode1);
		
		// binary to char
		char binary1 = 0b01000001;
		System.out.println("Binary to char: " + binary1);
	}
}
