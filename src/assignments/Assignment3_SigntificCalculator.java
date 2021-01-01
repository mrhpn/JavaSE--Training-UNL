package assignments;

import java.util.Map;

public class Assignment3_SigntificCalculator {

	/**
	 * Requirements 
	 * ============ 
	 * 1. 5 Simple Operations (+, -, *, /, %) 
	 * 2. Science Operations (6 Trigo Ratios) 
	 * 3. sqrt 
	 * 4. power 
	 * 5. exp 
	 * 6. log
	 * 7. log10 
	 * 8. PI,
	 * 9. E
	 * 
	 * Inputs: 
	 * ------- 
	 * 3 inputs for simple operations (operand1, operand2 and operator) 
	 * 2 inputs for science operations (operand1 and operator)
	 * 
	 * result and ask "Continue or exit"
	 * 
	 * Use Concepts of: 
	 * ---------------- 
	 * Information Hiding, Restriction and Multiple Class
	 */
	public static void main(String[] args) {
		String operator = "";
		int numberOfOperands;
		double firstOperand;
		double secondOperand;
		double result = 0;
		
		Console.printCommands();
		
		while(true) {
			Map<String, String> operationMap = Console.readOperator("Operation: \t", "Please enter commands shown in the list.");
			numberOfOperands = Integer.parseInt(operationMap.get("numberOfOperands"));
			operator = operationMap.get("operator");
			
			if (numberOfOperands == 0) {
				Operations operations = new Operations();
				if ("pi".equals(operator)) result = operations.pi();
				else if ("e".equals(operator)) result = operations.e();
			}
			
			else if (numberOfOperands == 1) {
				firstOperand = Console.readOperand("Operand: \t");
				Operations operations = new Operations(firstOperand);
				
				switch(operator) {
					case "sin":
						result = operations.sin();
						break;
					case "cos":
						result = operations.cos();
						break;
					case "tan":
						result = operations.tan();
						break;
					case "asin":
						result = operations.asin();
						break;
					case "acos":
						result = operations.acos();
						break;
					case "atan":
						result = operations.atan();
						break;
					case "sqrt":
						result = operations.sqrt();
						break;
					case "exp":
						result = operations.exp();
						break;
					case "log":
						result = operations.log();
						break;
					case "log10":
						result = operations.log10();
						break;
				}
			}
			
			else if (numberOfOperands == 2) {
				firstOperand = Console.readOperand("First operand: \t");
				secondOperand = Console.readOperand("Second operand: ");
				Operations operations = new Operations(firstOperand, secondOperand);
				
				switch(operator) {
					case "+":
					case "add":
						result = operations.add();
						break;
					case "-":
					case "sub":
						result = operations.subtract();
						break;
					case "*":
					case "mul":
						result = operations.multiply();
						break;
					case "/":
					case "div":
						result = operations.divide();
						break;
					case "%":
					case "mod":
						result = operations.modulus();
						break;
					case "pow":
						result = operations.pow();
					break;
				}
			}
			
			System.out.println("Result: \t" + result);
			System.out.println("---------------------");
			
			String quit = Console.prompt("Do you want to quit (y/n): ", "y", "n");
			if ("y".equals(quit)) {
				System.out.println("Good Bye...");
				break;
			}
			continue;
		}
	}

}
