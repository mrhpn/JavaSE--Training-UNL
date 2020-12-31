package basics;

public class MathTest {

	/**
	 * Math (methods under Math class are static methods because we can directly use them without creating object)
	 * ====
	 * 1. Random (0.0 ~ 0.9)
	 * 2. abs (to make number absolute)
	 * 3. round (nearest long or int based on argument)
	 * 4. ceil (upper integer value)
	 * 5. floor (lower integer value)
	 * 6. max
	 * 7. min
	 * 8. sqrt
	 * 9. 12 Trigo (sin, cos, tan, ...)
	 */
	public static void main(String[] args) {
		System.out.println("Random: " + Math.random());
		System.out.println("Abs: " + Math.abs(-22.333));
		System.out.println("Round: " + Math.round(0.6));
		System.out.println("Ceil: " + Math.ceil(0.6));
		System.out.println("Floor: " + Math.floor(0.6));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.toDegrees(Math.sin(60)));
		System.out.println(Math.cos(60));
		System.out.println(Math.tan(50));
		System.out.println(Math.asin(40));
		System.out.println(Math.acos(50));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.exp(4));
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}

}
