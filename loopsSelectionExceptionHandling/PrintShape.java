/*Create a program called PrintShape. The program should first input the height and width of a shape from the user. 
 * Then the program should print the shape using the asterisk (*) as shown in the example output. 
	Enter width: 6
	Enter height: 3
	
	******
	******
	****** */
package loopsSelectionExceptionHandling;

import java.util.Scanner;

public class PrintShape {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());

		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());

		System.out.println();

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		input.close();

	}

}
