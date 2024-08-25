/*Create a program called PrintNumbers_2. 
 * The program should be a new version of the PrintNumbers_1 program. 
 * The program should also print the count of numbers it has printed. 
	Enter the middle number: 1
	1 
	1 number printed*/
package loopsSelectionExceptionHandling;

import java.util.Scanner;

public class PrintNumbers_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the middle number: ");
		int num = Integer.parseInt(input.nextLine());

		int count = 0;

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			count++;
		}
		for (int i = num - 1; i >= 1; i--) {
			System.out.print(i + " ");
			count++;
		}

		System.out.println();

		if (count == 1) {
			System.out.println(count + " number printed");
		} else {

			System.out.println(count + " numbers printed");
		}

		input.close();

	}

}
