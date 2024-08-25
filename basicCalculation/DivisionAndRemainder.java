/*Create a program called DivisionAndRemainder that first inputs two integers x and y from the user.
 *  Then the program should determine if the integers are even or odd. In addition, 
 *  the program should compute the remainder of x / y and the remainder of y / x. 
 * • You can suppose that the user does not ever enter a zero.
 * 	Enter x: 12
	Enter y: 9

	12 is even
	9 is odd
	The remainder of 12 / 9 is 3
	The remainder of 9 / 12 is 9*/
package basicCalculation;

import java.util.Scanner;

public class DivisionAndRemainder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = Integer.parseInt(input.nextLine());
		System.out.print("Enter y: ");
		int y = Integer.parseInt(input.nextLine());

		if (x % 2 == 0) {
			System.out.println("\n" + x + " is even");
		} else {
			System.out.println(x + " is odd");
		}
		if (y % 2 == 0) {
			System.out.println(y + " is even");
		} else {
			System.out.println(y + " is odd");
		}
		System.out.println("The remainder of " + x + " / " + y + " is " + (x % y));
		System.out.println("The remainder of " + y + " / " + x + " is " + (y % x));
		input.close();

	}

}
