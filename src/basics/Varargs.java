package basics;

public class Varargs {

	/**
	 * Varargs Methods (introduced in Java 1.5)
	 * ========================================
	 * accepting flexible length of parameters
	 * 
	 * - must be last paremeter (int a, int b, int ...z)
	 * 
	 */
	public static void main(String[] args) {
		varargsMethod(true, new int[] {1, 2, 3} );
	}
	
	static void varargsMethod(boolean flag, int...items) {
		System.out.println(items.length);
	}

}
