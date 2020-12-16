package basics;

public class MultiDimentationalArray {

	/**
	 * MultiDimentationalArray =======================
	 * 
	 * Creating Phase 
	 * -------------- 
	 * int[][] myArray = { { 10, 20, 30, 40 }, { 50, 60 } };
	 * 
	 * Calling Back 
	 * ------------ 
	 * myArray[rowIndex][columnIndex];
	 * 
	 */

	public static void main(String[] args) {
		int[][] myArray2D = { { 10, 20, 30, 40 }, { 50, 60 }, };
		System.out.println(myArray2D[0][1]); // 20
		System.out.println(myArray2D[1][1]); // 60
		System.out.println("myArray2D\'s length: " + myArray2D.length); // 2
		System.out.println("Child array\'s length: " + myArray2D[0].length); // 4
	}

}
