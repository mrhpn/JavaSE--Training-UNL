package basics;

public class MethodOverloading {

	/**
	 * Method Overloading (Compile time polymorphism)
	 * ==============================================
	 * Same Name, Different Signatures
	 */
	public static void main(String[] args) {
		System.out.println(sum(10.0, 20.0));
		System.out.println(sum(10.0, 20.0, 30.0));
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 20, 30));

	}
	
	static double sum(double a, double b) {
		return a + b;
	}
	
	static double sum(double a, double b, double c) {
		return a + b + c;
	}
	
	static double sum(double a, double b, double c, double d) {
		return a + b + c + d;
	}
	
	static int sum(int a, int b) {
		return a + b;
	}
	
	static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

}
