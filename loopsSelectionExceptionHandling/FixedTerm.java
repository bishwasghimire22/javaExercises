package loopsSelectionExceptionHandling;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FixedTerm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDeci = new DecimalFormat("0.00");

		System.out.print("Enter initial deposit: ");
		double initialDeposit = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter time period in full years: ");
		int years = Integer.parseInt(input.nextLine());

		System.out.print("Enter interest rate (%): ");
		double interestRate = Double.parseDouble(input.nextLine().replace(',', '.')) / 100.00;

		System.out.print("Enter capital income tax rate (%): ");
		double incomeTaxRate = Double.parseDouble(input.nextLine().replace(',', '.')) / 100.00;

		double balance = initialDeposit;
		double totalInterest = 0;

		System.out.println();

		for (int year = 1; year <= years; year++) {
			double interest = balance * interestRate;

			totalInterest += interest;
			balance += interest;

			System.out.println("Year " + year + ": " + twoDeci.format(totalInterest) + " | " + twoDeci.format(balance));

		}

		System.out.println();

		double interestAfterTax = totalInterest - (totalInterest * incomeTaxRate);
		double remainingBalnce = initialDeposit + interestAfterTax;

		System.out.println("The interest after tax is " + twoDeci.format(interestAfterTax));
		System.out.println("The reamining balance after tax is " + twoDeci.format(remainingBalnce));
		input.close();

	}

}

/*
 * Create a program called FixedTerm to compute interest for the initial deposit
 * in a fixed term savings account. A fixed term savings account allows you to
 * lock away a sum of money for an agreed time period. Assume that
 * 
 * • The interest rate is fixed • The annual interest is left to balance • We
 * can withdraw the money only at the end of the agreed time period. • The bank
 * subtracts capital income tax from the compound interest when we withdraw the
 * money at the end of the time period.
 * 
 * The program should first input the initial deposit, number of years, interest
 * rate (%), and capital income tax rate (%).
 * 
 * Then the program should compute and show the compound interest and the
 * balance at the end of each year. Finally, the program should show the
 * interest after tax and the remaining balance after tax NB! You should compute
 * the result in a simple for loop where you keep adding the annual interest to
 * the balance etc. If you try to use some pre-defined compound interest
 * formula, it might give you slightly different results. NB! Please change your
 * calculation order if the last decimal on some value differs from the example
 * output.
 */
