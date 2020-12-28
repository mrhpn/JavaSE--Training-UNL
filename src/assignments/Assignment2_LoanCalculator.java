package assignments;

import java.text.NumberFormat;
import java.util.Scanner;

public class Assignment2_LoanCalculator {

	/**
	 * Requirements
	 * ============
	 * inputs (amount, month, %)
	 * output (total amount to pay back & total amount for each month)
	 *
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		int MIN_PRINCIPAL = 100_000;
		int MAX_PRINCIPAL = 2_000_000;
		float MIN_ANNUAL_INTEREST = 1;
		float MAX_ANNUAL_INTEREST = 20;
		byte MIN_NUMBER_OF_PAYMENTS = 6;
		byte MAX_NUMBER_OF_PAYMENTS = 30;
		
		double principal = 0;
		float annualInterest = 0;
		float monthlyInterestRate = 0;
		byte years = 0;
		int numberOfPayments = 0;
		
		while(true) {
			System.out.print("Principal: ");
			principal = input.nextDouble();
			if (principal >= MIN_PRINCIPAL && principal <= MAX_PRINCIPAL) break;
			System.out.println("Enter value between " + MIN_PRINCIPAL + " and " + MIN_PRINCIPAL);
		}
		
		while(true) {
			System.out.print("Annual Interest: ");
			annualInterest = input.nextFloat();
			if (annualInterest >= MIN_ANNUAL_INTEREST && annualInterest <= MAX_ANNUAL_INTEREST) {
				monthlyInterestRate = annualInterest / PERCENT / MONTHS_IN_YEAR;				
				break;
			}
			System.out.println("Enter value between " + MIN_ANNUAL_INTEREST + " and " + MAX_ANNUAL_INTEREST);
		}
		
		while(true) {
			System.out.print("Period (Years): ");
			years = input.nextByte();
			if (years >= MIN_NUMBER_OF_PAYMENTS && years <= MAX_NUMBER_OF_PAYMENTS) {
				numberOfPayments = years * MONTHS_IN_YEAR;
				break;
			}
			System.out.println("Enter value between " + MIN_NUMBER_OF_PAYMENTS + " and " + MAX_NUMBER_OF_PAYMENTS);
		}
		
		double monthlyPayment = principal 
				* (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) 
				/ Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1;
		
		double totalAmountPayBack = monthlyPayment * numberOfPayments;
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String formattedMonthlyPayment = currency.format(monthlyPayment);
		String formattedTotalAmountPayBack = currency.format(totalAmountPayBack);
		
		System.out.println("Monthly Payment: " + formattedMonthlyPayment);
		System.out.println("Total Amount to Pay Back: " + formattedTotalAmountPayBack);
	}

}
