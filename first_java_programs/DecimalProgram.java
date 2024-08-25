/*Create a program called Decimal Program that first inputs two decimal values from the user. 
 * Then the program should multiply the values together and print the calculations as shown in the example output. 
 * • The program should accept both comma and dot as decimal part separator.
 * Enter a decimal number: 2,5
Enter a decimal number: 3,1415926

2,50 * 3,14 = 7,85
2,50 * 3,14 = 7,853981*/

package first_java_programs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		double num1 = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter a decimal number: ");
		double num2 = Double.parseDouble(input.nextLine().replace(',', '.'));

		DecimalFormat twodeci = new DecimalFormat("0.00");
		DecimalFormat sixdeci = new DecimalFormat("0.000000");
		double result = num1 * num2;

		System.out.println("\n" + twodeci.format(num1) + " * " + twodeci.format(num2) + " = " + twodeci.format(result));
		System.out.println(twodeci.format(num1) + " * " + twodeci.format(num2) + " = " + sixdeci.format(result));

		// System.out.printf("\n%.2f * %.2f = %.2f", num1, num2, result);
		// System.out.printf("\n%.2f * %.2f = %.6f", num1, num2, result);

		input.close();

	}

}
