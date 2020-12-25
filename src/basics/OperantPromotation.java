package basics;

public class OperantPromotation {

	/**
	 * Byte to int
	 * ===========
	 * 125(byte) + 2(byte) + 20 = 147(int)
	 * 
	 * #NOTE
	 * Operands smaller than int will be promoted to int.
	 * 
	 * Mixed type operation
	 * ====================
	 * example: operation with double and int
	 * int x = 10;
	 * double y = 5.0;
	 * double result = x / y; // 2.0
	 */
	public static void main(String[] args) {
		System.out.println(3 + 5 + 7 - 10 * 3);
		
		int sum = (20 + 5) - (30 * 4) / (23 % 8);
		System.out.println(sum);
		
		byte a = 120;
		Object b = a;
		System.out.println(b.getClass()); // class java.lang.Byte
		byte c = (byte) (a + 10);
		System.out.println(c); // -126
	}

}
