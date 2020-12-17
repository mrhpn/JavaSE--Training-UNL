package basics;

public class ThreeDArrays {

	/**
	 * 3D Arrays
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[][][] unitsSold = {
				// Yangon
				{ 
					{ 23, 40, 100, 230 }, // January's sales
					{ 39, 39, 299, 299 }, // Febuary's sales
					{ 0, 0, 0, 0 }
				},
				// Mandalay
				{ 
					{ 23, 40, 100, 230 }, // January's sales
					{ 39, 39, 299, 299 }, // Febuary's sales
					{ 0, 0, 0, 0 }
				},
				// Taung Gyi
				// Yangon
				{ 
					{ 23, 40, 100, 230 }, // January's sales
					{ 39, 39, 299, 299 }, // Febuary's sales
					{ 0, 0, 0, 0 }
				}
			};
		
		System.out.println("Mandalay Unit Scores: " + unitsSold[0][1][3]);

	}

}
