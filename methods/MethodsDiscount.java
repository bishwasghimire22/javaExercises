package methods;

import java.util.Scanner;

public class MethodsDiscount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list price: ");
		double lp = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter selling price: ");
		double sp = Double.parseDouble(input.nextLine().replace(',', '.'));

		double percent = computePercentage(lp, sp);

		System.out.printf("\nThe discount percentage is %.2f %%", percent);

		input.close();

	}

	private static double computePercentage(double lp, double sp) {
		double dicountPercentage = ((lp-sp) / lp)* 100.00;
		return dicountPercentage;
	}

}
/*Create a program called MethodsDiscount that has a method called computePercentage. The
computePercentage method should take list price and selling price as parameters. The method
should compute and return the discount percentage.
The main method should first input the prices from the user and then call the computePercentage
method with the inputted values. Finally, the main method should print the discount percentage
with two decimal places. The computePercentage method should not print anything.*/
