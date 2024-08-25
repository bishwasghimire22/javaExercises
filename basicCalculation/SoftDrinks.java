/*Create a program called SoftDrinks  that first inputs the number of students and the number of soft drink bottles from the user. 
 * Then the program should compute how many bottles of soft drinks there are per student and how many leftover bottles there will be. 
 * Each student should get the same number of bottles. 
 *  • You can suppose that the user does not ever enter a zero. 
 *  Enter the number of students: 2
	Enter the number of bottles: 6
	
	There will be 3 bottles for each student.
	There will be 0 leftover bottles*/
package basicCalculation;

import java.util.Scanner;

public class SoftDrinks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int student = Integer.parseInt(input.nextLine());
		System.out.print("Enter the number of bottles: ");
		int bottle = Integer.parseInt(input.nextLine());

		System.out.println("\nThere will be " + (bottle / student) + " bottles for each student.");
		System.out.println("There will be " + (bottle % student) + " leftover bottles");

		input.close();

	}

}
