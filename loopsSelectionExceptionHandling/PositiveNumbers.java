/*Create a program called PositiveNumbers that first inputs integers from the user until the user decides to quit by entering a zero. 
 * Then the program should compute and print the average of the entered positive integers with two decimals. 
 * If the only entered value is a zero, the program should print "No positive values".
 	Enter first integer: 1
	Enter next integer: -2
	Enter next integer: 4
	Enter next integer: 0
	
	The average of the positive values is 2,5 */
package loopsSelectionExceptionHandling;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDeci = new DecimalFormat("0.0");
		System.out.print("Enter first integer: ");
		int num = Integer.parseInt(input.nextLine());

		int sum = 0;
		int count = 0;

		while (num != 0) {
			if (num > 0) {
				sum += num;
				count++;
			}
			System.out.print("Enter next integer: ");
			num = Integer.parseInt(input.nextLine());
		}

		double average = (double) sum / count;
		if (count <= 0) {
			System.out.println("No positive values");
		} else {
			System.out.println("The average of the positive values is " + oneDeci.format(average));

		}

		input.close();

	}

}
