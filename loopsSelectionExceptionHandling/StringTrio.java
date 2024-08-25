/*Create a program called StringTrio that first inputs three strings from the user. 
 * Then the program compares the strings and displays one of the following:
 *  • The strings are equal in case-sensitive comparison 
 *  • The strings are equal in case-insensitive comparison   
 *  • The strings are not equal 
 *  	Enter first string: Java
		Enter second string: Java
		Enter third string: Java

		The strings are equal in case-sensitive comparison*/
package loopsSelectionExceptionHandling;

import java.util.Scanner;

public class StringTrio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String txt1 = input.nextLine();

		System.out.print("Enter second string: ");
		String txt2 = input.nextLine();

		System.out.print("Enter third string: ");
		String txt3 = input.nextLine();

		System.out.println();

		if (txt1.equals(txt2) && txt2.equals(txt3)) {
			System.out.println("The strings are equal in case-sensitive comparison");

		} else if (txt1.equalsIgnoreCase(txt2) && txt2.equalsIgnoreCase(txt3)) {
			System.out.println("The strings are equal in case-insensitive comparison");
		} else {
			System.out.println("The strings are not equal ");
		}

		input.close();

	}

}
