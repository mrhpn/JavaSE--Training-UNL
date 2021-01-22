package assignment_6_1;

import java.text.NumberFormat;

/**
 * MortgageReport Class to report Mortgage loan and payment schedule
 * 
 * Used concepts:
 * --------------
 * - Encapsulation
 * - Abstraction
 * 
 * @author Htet Phyo Naing
 *
 */
public class MortgageReport {
	
	private final NumberFormat currency;
	private MortgageCalculator calculator;
	
	public MortgageReport(MortgageCalculator calculator) {
		this.calculator = calculator;
		currency = NumberFormat.getCurrencyInstance();
	}

	/**
	 * Printing mortgage loan
	 */
	public void printMortgage() {
		double mortgage = calculator.calculateMortgage();
		String mortgageFormatted = currency.format(mortgage);
		
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("Monthly Payments: " + mortgageFormatted);
	}
	
	/**
	 * Printing payment schedule in nice format
	 */
	public void printPaymentSchedule() {
		System.out.println();
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");
		for(double balance: calculator.getRemainingBalances())
			System.out.println(currency.format(balance));
	}
}
