package basics;

public class LoopControlStatements {

	/**
	 * Loop Control Statement
	 * ======================
	 * 1. continue - skip the n iteration
	 * 2. break - stop the iteration and jump out from the loop
	 * 
	 */
	public static void main(String[] args) {
		for (int i = 30; i <= 210; i+=30) {
			if (i == 90) continue;
			
			System.out.println(i);
		}
		
		for (int i = 30; i <= 210; i+=30) {
			if (i == 90) break;
			
			System.out.println(i);
		}
	}

}
