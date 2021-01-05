package assignments;

import java.util.HashMap;
import java.util.Map;

public class Operations {
	private double operand1;
	private double operand2;
	
	private Map<String, Integer> supportedOperations = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put("+", 2);
			put("-", 2);
			put("*", 2);
			put("/", 2);
			put("%", 2);
			put("add", 2);
			put("sub", 2);
			put("mul", 2);
			put("div", 2);
			put("mod", 2);
			put("pow", 2);
			put("sin", 1);
			put("cos", 1);
			put("tan", 1);
			put("asin", 1);
			put("acos", 1);
			put("atan", 1);
			put("sqrt", 1);
			put("exp", 1);
			put("log", 1);
			put("log10", 1);
			put("pi", 0);
			put("e", 0);
		}
	};
	
	public Operations() {
	}
	
	public Operations(double operand1) {
		this.operand1 = operand1;
	}
	
	public Operations(double operand1, double operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
//	public Operations(double operand2, double operand1) {
//		//
//	}
//	
//	// static factory method
//	public static Operations doOperations() {
//		return new Operations();
//	}
	
	public double add() {
		return operand1 + operand2;
	}
	
	public double subtract() {
		return operand1 - operand2;
	}
	
	public double multiply() {
		return operand1 * operand2;
	}
	
	public double divide() {
		return operand1 / operand2;
	}
	
	public double modulus() {
		return operand1 % operand2;
	}
	
	public double pow() {
		return Math.pow(operand1, operand2);
	}
	
	public double sin() {
		return Math.sin(operand1);
	}
	
	public double cos() {
		return Math.cos(operand1);
	}
	
	public double tan() {
		return Math.tan(operand1);
	}
	
	public double asin() {
		return Math.asin(operand1);
	}
	
	public double acos() {
		return Math.acos(operand1);
	}
	
	public double atan() {
		return Math.atan(operand1);
	}
	
	public double sqrt() {
		return Math.sqrt(operand1);
	}
	
	public double exp() {
		return Math.exp(operand1);
	}
	
	public double log() {
		return Math.log(operand1);
	}
	
	public double log10() {
		return Math.log10(operand1);
	}
	
	public double pi() {
		return Math.PI;
	}
	
	public double e() {
		return Math.E;
	}

	public Map<String, Integer> getSupportedOperations() {
		return supportedOperations;
	}
}