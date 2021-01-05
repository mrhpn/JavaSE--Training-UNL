package basics;

public class StaticVariableTest {

	/**
	 * Static Variables
	 * ================
	 * - declared with static keywords
	 * - declared within class
	 * - there is initial default. e.g: int -> 0, double -> 0.0
	 * - access: ClassName.staticVariable
	 * - available through its all objects
	 * 
	 */
	public static void main(String[] args) {
		Counter c1 = new Counter();
		System.out.println("C1: " + Counter.count);
		
		Counter c2 = new Counter();
		System.out.println("C2: " + Counter.count);
		
		Counter c3 = new Counter();
		System.out.println("C3: " + Counter.count);
		
		System.out.println("Count: " + Counter.count);

	}

}
