package assignment_6_1;

public class Main {
	/**
	 * Mortgage Calculator and Calculating Remaining balances
	 * ------------------------------------------------------
	 * Wonder what the mortgage is? Check out: https://en.wikipedia.org/wiki/Mortgage_loan
	 * 
	 * This type of calculator needs 3 values: principal, annual interest or monthly interest rate and total years.
	 */
	public static void main(String[] args) {
		// reading user input from the console
		int principal = (int) Console.readNumber("Principal: ", 1000, 1000000);
		float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 20);
		byte years = (byte) Console.readNumber("Period: ", 1, 30);
		
		var calculator = new MortgageCalculator(principal, annualInterest, years);
		var report = new MortgageReport(calculator);
		report.printMortgage();
		report.printPaymentSchedule();
	}
}
