package basics;

public class BoxPrimitives {

	/**
	 * Box Primitives (Wrapper Class)
	 * ===============================
	 * - auto boxing
	 * - unboxing
	 * 
	 * Why we use
	 * ----------
	 * - time and space efficiency
	 * - boxed primitives are classes, primitives have only values
	 * - they have identities too
	 * 		== & != -> identity comparison
	 * 
	 */
	public static void main(String[] args) {
		String numString = "20";
		
		int num = Integer.parseInt(numString);
		String num1 = Integer.toString(num);
		
		System.out.println(num);
		System.out.println(num1);

		Integer num5 = 30; // auto boxing
		int num6 = num5; // unboxing
		
		long start = System.nanoTime();
		testTime();
		long end = System.nanoTime();
		
		System.out.println((end - start) / 1000000 + " ms");
	}
	
	static void testTime() {
		Long sum = 0L;
		
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
