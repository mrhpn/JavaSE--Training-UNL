package assignment_6_1;

/**
 * MortgageCalculator Class to calculate Mortgage loan and payment schedule
 * 
 * Used concepts:
 * --------------
 * - Encapsulation
 * - Abstraction
 * 
 * @author Htet Phyo Naing
 *
 */
public class MortgageCalculator {
	private final static byte PERCENT = 100;
	private final static byte MONTHS_IN_YEAR = 12;
	
	private int principal;
	private float annualInterest;
	private byte years;
	
	public MortgageCalculator(int principal, float annualInterest, byte years) {
		this.principal = principal;
		this.annualInterest = annualInterest;
		this.years = years;
	}

	/**
	 * Calculation Balance
	 * -------------------
	 * This method takes care of calculating balance you have to pay back every month.
	 * 
	 * @param numberOfPaymentsMade
	 * @return balance
	 */
	public double calculateBalance(short numberOfPaymentsMade) {
		float monthlyInterest = getMonthlyInterest();
		float numberOfPayments = getNumberOfPayments();
		
		double balance = principal 
				* (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
		
		return balance;
	}
	
	/**
	 * Calculation Mortgage
	 * ------------------------------------------------
	 * This method takes care of calculating mortgage loan.
	 * 
	 * @return mortgage
	 */
	public double calculateMortgage() {
		float monthlyInterest = getMonthlyInterest();
		float numberOfPayments = getNumberOfPayments();
		
		double mortgage = principal 
				* (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) 
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
		
		return mortgage;
	}
	
	/**
	 * Calculation Remaining Balance
	 * -----------------------------
	 * This method takes care of printing remaining balances or payment schedule you have to pay back every month.
	 * 
	 * @return balances
	 */
	public double[] getRemainingBalances() {
		var balances = new double[getNumberOfPayments()];
		for(short month = 1; month <= balances.length; month++)
			balances[month - 1] = calculateBalance(month);
		return balances;
	}
	
	/**
	 * Calculating monthly interest rate
	 */
	private float getMonthlyInterest() {
		return annualInterest / PERCENT / MONTHS_IN_YEAR;
	}
	
	/**
	 * Calculating number of payments
	 */
	private int getNumberOfPayments() {
		return years * MONTHS_IN_YEAR;
	}
}
