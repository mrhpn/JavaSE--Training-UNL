package exceptions;

public class ExceptionTest {
	/**
	 * Exception
	 * ----------
	 * - problem/bugs has been occured by user or system
	 * 
	 * Exception Handling
	 * ------------------
	 * 1. try catch
	 * 2. throws
	 * 3. assertions
	 * 
	 * Exceptions Types
	 * ----------------
	 * 1. unchecked (runtime exception)
	 * 2. checked (compile time exception)
	 */
	
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
			int numArray[] = { 10, 20, 30 };
			System.out.println(numArray[5]);
			
			int numArray1[] = new int[-4];
			
		} catch(ArithmeticException ex) {
			ex.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("System ... Continue");
		
		try {
			System.out.println(new ExceptionTest().divided(10, 0));			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public double divided(double operand1, double operand2) throws ArithmeticException {
		if (operand2 == 0) {
			throw new ArithmeticException("Why divided by 0?");
		} else {
			return operand1 / operand2;
		}
	}
}
