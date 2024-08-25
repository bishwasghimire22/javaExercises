/*Create a program called PrintNumbers_1 that first inputs an integer from the user.
 *  Then the program should print integers on a single line as shown in the example output. 
 * If there are no integers to be printed, the program should not print anything. 
 *    Enter the middle number: 10
      1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1 */
package loopsSelectionExceptionHandling;

import java.util.Scanner;

public class PrintNumbers_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the middle number: ");
		int num = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		for (int i = num - 1; i >= 1; i--) {
			System.out.print(i + " ");
		}

		input.close();

	}

}
