package basics;

public class ArraysLesson {

	/**
	 * Arrays
	 * ======
	 * 
	 * Container Object that holds fixed dataType and different values
	 * 
	 * Standard Form
	 * -------------
	 * int[] myArray = new int[3];
	 * myArray[0] = 100;
	 * myArray[1] = 200;
	 * myArray[2] = 300;
	 * 
	 * Initialize Form
	 * ---------------
	 * int[] myArray = { 100, 200, 300 };
	 * 
	 * Calling Back
	 * ------------
	 * myArray[1]
	 * 
	 * Types of Exception that may happen
	 * ----------------------------------
	 * 1. ArrayIndexOutOfBoundException
	 * 2. NegativeArraySizeException 
	 */
	
	public static void main(String[] args) {
		 int[] myArray = new int[3];
		 myArray[0] = 100;
		 myArray[1] = 200;
		 myArray[2] = 300;
		 
		 System.out.println("Value of Index 2 in myArray: " + myArray[2]);
		 System.out.println("Length of Array: " + myArray.length);
		 
		 int[] myArray1 = { 100, 200, 300 };
		 System.out.println("Value of Index 2 in myArray1: " + myArray1[2]);

		 /**
		  * EXCEPTIONS
		  * ----------
		  * System.out.println("Value of Index 4: " + myArray[4]); -> ArrayIndexOutOfBoundException
		  * int[] myArray2 = new int[-3]; -> NegativeArraySizeException
		  */
	}

}
