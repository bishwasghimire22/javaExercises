/* Create a program called ValidatePrice that first inputs the product price before VAT from the user.
 *  Then the program should compute and print the VAT inclusive price with two decimal places as shown in the example output. 
 *  Suppose that the VAT is always 25 %.  
 * If the program fails to convert the inputted string to a double, it should print "Invalid price!".
 */
package loopsSelectionExceptionHandling;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValidatePrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double VAT = 0.25;
		DecimalFormat twodeci = new DecimalFormat("0.00");

		try {
			System.out.print("Enter the price before VAT: ");
			double price = Double.parseDouble(input.nextLine().replace(',', '.'));

			double totalPrice = price * (1 + VAT);
			System.out.println("\nThe VAT inclusive price is " + twodeci.format(totalPrice));

		} catch (NumberFormatException nfe) {
			System.out.println("\nInvalid price!");
		}

		input.close();

	}

}
