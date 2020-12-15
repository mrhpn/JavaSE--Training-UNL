package basics;

public class TypeCasting {

	/**
	 * TYPE CASTING (Assigning one type of variable to another)
	 * ========================================================
	 * 
	 * Types of type casting
	 * ---------------------
	 * 1. Implicit Casting - No Data Loss       - (performed by compiler)  - Widen Conversion
	 * 2. Explicit Casting - Possibly Data Loss - (performed by developer) - Narrow Conversion
	 * 
	 * 1. Implicit Casting
	 * -------------------
	 * int a = 30;
	 * long b = a; (implicit casting by compiler)
	 * 
	 * BITs hold by various data types
	 * -------------------------------
	 * byte   - 8
	 * short  - 16
	 * int    - 32
	 * long   - 64
	 * float  - 32
	 * double - 64
	 * char   - 16
	 * 
	 * 2. Explicit Casting
	 * -------------------
	 * long a = 50;
	 * int b = (int) a;
	 * 
	 * Data Loss
	 * ---------
	 * byte a = (byte) 12345666; // result -> 66 -> max value of byte
	 * 
	 * Truncation
	 * ----------
	 * int b = (int) 3.142F; // result -> 3
	 * char c = (char) 65.8; // result -> A
	 * 
	 * RULES ADDRESSED TO TYPE CASTING
	 * -------------------------------
	 * 1. Numeric to Numeric
	 * 2. Cannot cast to Boolean (via visa)
	 */
	public static void main(String[] args) {
		// Implicit Casting
		int z = 35;
		long y = z;
		double x = z;
		float q = z;
		
		// Explicit Casting
		byte a = (byte) 12345666;
		System.out.println(a); // 66
		
		int b = (int) 3.142F;
		System.out.println(b); // 3
		
		char c = (char) 65.8;
		System.out.println(c); // A
		
		// Special Conversion - Explicit Casting
		byte byte1 = 127; // byte -> int (Widening)
		char c1 = (char) byte1; // int -> char (Narrowing)
		System.out.println("Special Conversion: " + c1);
	}

}
