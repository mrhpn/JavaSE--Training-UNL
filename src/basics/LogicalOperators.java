package basics;

public class LogicalOperators {

	/**
	 * Logical Operators
	 * =================
	 * let int a = 10, b = 20;
	 * 1. && (a == 10 && b == 20) - true
	 * 2. || (a == 10 || b == 30) - false
	 * 3. !
	 */
	public static void main(String[] args) {
		int x = 10, b = 30;
		boolean flag = false;
		
		System.out.println(x > 10);
		System.out.println(x < 10);
		System.out.println(x >= 10);
		System.out.println(x <= 10);
		System.out.println(x == 10);
		System.out.println(x != 10);
		
		System.out.println(x > 10 && b < 30);
		System.out.println(x > 10 || b < 30);
		System.out.println(!flag);
	}

}
