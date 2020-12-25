package basics;

public class ArithmeticTest {

	/**
	 * Arithmetics Test
	 * ================
	 * Unary (+) and Unary (-) and so on...
	 * int x += 5;
	 * int x -= 5;
	 * 
	 * Pre and Post Increment/Decrement
	 * ++x;
	 * x++;
	 * --y;
	 * y--;
	 * 
	 */
	public static void main(String[] args) {
		// Unary Operator
		int x = 500;
		int y = 20;
		
		x += 5;
		x -= 5;
		x *= 5;
		x /= 5;
		x %= 5;
		System.out.println(x);
		
		// Pre
		System.out.println(++x);
		// Post
		System.out.println(y++);

	}

}
