package enums;

public class Main {

	/**
	 * Enums
	 * -----
	 * Group of constants
	 * 
	 */
	public static void main(String[] args) {
		StateAndDivision state = StateAndDivision.YANGON;
		
		switch (state) {
			case AYEYARWADY:
				System.out.println("Fishing");
				break;
			case YANGON:
				System.out.println("Commercial City");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + state);
		}
	}

}
