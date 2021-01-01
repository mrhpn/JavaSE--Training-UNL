package assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Console {
	private static String operator = "";
	private static Scanner input = new Scanner(System.in);
	private static String quit = "";
	
	public static String prompt(String prompt, String yes, String no) {
		while(true) {
			System.out.print(prompt);
			quit = input.nextLine();
			
			if (quit.equals(yes) || quit.equals(no)) break; 
			
			else continue;
		}
		return quit;
	}
	
	public static Double readOperand(String prompt) {
		System.out.print(prompt);
		double operand = input.nextDouble();
		input.nextLine();
		
		return operand;
	}
	
	@SuppressWarnings("serial")
	public static Map<String, String> readOperator(String prompt, String errorMessage) {
		Map<String, Integer> supportedOperations = new Operations().getSupportedOperations();
		
		while(true) {
			System.out.print(prompt);
			operator = input.nextLine();
					
			if (supportedOperations.containsKey(operator)) break;
			
			System.out.println(errorMessage);
		}
		
		return new HashMap<String, String>(){
			{
				put("operator", operator);
				put("numberOfOperands", supportedOperations.get(operator).toString());
			}
		};
	}

	public static void printCommands() {
		System.out.println("Scientific Calculator (v1.0.0)");
		System.out.println("==============================");
		System.out.println("Which operation do you want to perform? Type command or text-command.");

		String[][] basicCalculationsData = new String[][] { 
			{ "No", "Command", "Text-Command", "Description" },
			{ "1", "+", "add", "Add" }, 
			{ "2", "-", "sub", "Subtract" }, 
			{ "3", "*", "mul", "Multiply" },
			{ "4", "/", "div", "Divide" }, 
			{ "5", "%", "mod", "Modulus" } 
		};

		String[][] scientificCalculationsData = new String[][] { 
			{ "No", "Command", "Description" },
			{ "1", "sin", "Sine" }, 
			{ "2", "cos", "Cosine" }, 
			{ "3", "tan", "Tan" }, 
			{ "4", "asin", "Arc Sine" },
			{ "5", "acos", "Arc Cosine" }, 
			{ "6", "atan", "Arc Tan" }, 
			{ "7", "sqrt", "Square Root" },
			{ "8", "pow", "Power" }, 
			{ "9", "exp", "Expontineal" }, 
			{ "10", "log", "Log" },
			{ "11", "log10", "Log10" }, 
			{ "12", "pi", "Print PI value" }, 
			{ "13", "e", "Print E value" }
		};
		
		printInTableFormat("Basic Calculations", basicCalculationsData);
		printInTableFormat("Scientific Calculations", scientificCalculationsData);
	}

	private static void printInTableFormat(String title, String[][] data) {
		boolean leftJustifiedRows = true;
		String[][] table = data;

		/*
		 * Calculate appropriate Length of each column by looking at width of data in
		 * each column.
		 */
		Map<Integer, Integer> columnLengths = new HashMap<>();
		Arrays.stream(table).forEach(a -> Stream.iterate(0, (i -> i < a.length), (i -> ++i)).forEach(i -> {
			if (columnLengths.get(i) == null) {
				columnLengths.put(i, 0);
			}
			if (columnLengths.get(i) < a[i].length()) {
				columnLengths.put(i, a[i].length());
			}
		}));

		/*
		 * Prepare format String
		 */
		final StringBuilder formatString = new StringBuilder("");
		String flag = leftJustifiedRows ? "-" : "";
		columnLengths.entrySet().stream().forEach(e -> formatString.append("| %" + flag + e.getValue() + "s "));
		formatString.append("|\n");

		/*
		 * Prepare line for top, bottom & below header row.
		 */
		String line = columnLengths.entrySet().stream().reduce("", (ln, b) -> {
			String templn = "+-";
			templn = templn + Stream.iterate(0, (i -> i < b.getValue()), (i -> ++i)).reduce("", (ln1, b1) -> ln1 + "-",
					(a1, b1) -> a1 + b1);
			templn = templn + "-";
			return ln + templn;
		}, (a, b) -> a + b);
		line = line + "+\n";

		/*
		 * Print table
		 */
		System.out.println("<" + title + ">");
		System.out.print(line);

		Arrays.stream(table).limit(1).forEach(a -> System.out.printf(formatString.toString(), a));
		System.out.print(line);
		Stream.iterate(1, (i -> i < table.length), (i -> ++i))
				.forEach(a -> System.out.printf(formatString.toString(), table[a]));

		System.out.print(line);
	}
}
