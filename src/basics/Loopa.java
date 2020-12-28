package basics;

public class Loopa {

	public static void main(String[] args) {

		// မနလနမျငညါreversing for loop
		for (int i = 1000; i >= 1; i--) {
			// System.out.println(i);
		}
		
		System.out.println("---------------------------");

		// reversing while loop
		int y = 1000;
		while (y >= 10) {
			// System.out.println(y);
			y -= 10;
		}
		
		int x = 10;
		do {
			x += 10;
			System.out.println("Count by 10: " + x);
		} while(x <= 5000);
	}

}
