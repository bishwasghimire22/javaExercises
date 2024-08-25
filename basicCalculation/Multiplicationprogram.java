/*Create a program called Multiplication program that first inputs two decimal numbers from the user.
 *  Then the program should compute and print the product of the decimal numbers as shown in the example output.  
 *  NB! The program should be to perform 100 % accurate computations on decimal values.
 *  It should always print a mathematically correct result. 
	 *  Enter x: 0.1
		Enter y: 2.2

		0.1 * 2.2 = 0.22*/
package basicCalculation;

import java.math.BigDecimal;
import java.util.Scanner;

public class Multiplicationprogram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x: ");
		BigDecimal x = new BigDecimal(input.nextLine().replace(',', '.'));
		System.out.print("Enter y: ");
		BigDecimal y = new BigDecimal(input.nextLine().replace(',', '.'));

		BigDecimal multiplication = x.multiply(y);
		System.out.println(x + " * " + y + " = " + multiplication);

		input.close();

	}

}
