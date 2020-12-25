package basics;

public class BitwiseOperators {

	/**
	 * Bitwise Operators
	 * =================
	 * Operate on individual bits of operands
	 * 
	 * Operands
	 * 1. Integer Primitives
	 * 2. Boolean (rare)
	 * 
	 * used in:
	 * 1. embedded system
	 * 2. Hashmap (hash tables)
	 * 3. Compression or Encrypt
	 * 
	 * & - Bitwise AND
	 * | - Bitwise OR
	 * ^ - Bitwise XOR (Exclusive OR)
	 * ~ - Bitwise NOT
	 * 
	 * & - returns 1 if both inputs bits are 1
	 * 00000000 00000000 00000000 00000001 (x)
	 * 00000000 00000000 00000000 00000011 (y)
	 * ---------------------------------------
	 * 00000000 00000000 00000000 00000001 (1)
	 * (x & y ) = 1
	 * 
	 * | - returns 1 if either of inputs bits is 1
	 * 00000000 00000000 00000000 00000001 (x)
	 * 00000000 00000000 00000000 00000011 (y)
	 * ---------------------------------------
	 * 00000000 00000000 00000000 00000011 (3)
	 * (x | y ) = 3
	 * 
	 * ^ - returns 1 only if one of the input bits is 1 but not both
	 * 00000000 00000000 00000000 00000001 (x)
	 * 00000000 00000000 00000000 00000011 (y)
	 * ---------------------------------------
	 * 00000000 00000000 00000000 00000010 (2)
	 * (x ^ y) = 2
	 * 
	 * ~ - returns inverted bits
	 * let x = 1;
	 * 00000000 00000000 00000000 00000001 (x)
	 * -----------------------------------
	 * 11111111 11111111 11111111 11111110
	 * ~x = -2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 3;
		
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);
		System.out.println(~x);
		System.out.println(~y);
	}

}
