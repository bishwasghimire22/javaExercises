/* Create a program called ValidateOddNumber that asks the user to enter an odd number. 
 *  • If the inputted value cannot be converted to an integer, 
 *  the program should print the value enclosed in single quotes and " is not an integer". 
 *    • If the inputted value is not an odd integer, the program should print the value and " is not an odd number".  
 * • Otherwise, the program should print "Ok". 
 */
package loopsSelectionExceptionHandling;

import java.util.Scanner;

public class ValidateOddNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an odd number: ");
		String txt = input.nextLine();
		System.out.println();
		try {
			int num = Integer.parseInt(txt);
			if (num % 2 != 0) {
				System.out.println("Ok");
			} else {
				System.out.println(num + " is not an odd number");
			}

		} catch (NumberFormatException nfe) {
			System.out.println("'" + txt + "'" + " is not an integer");
		}

		input.close();

	}

}
