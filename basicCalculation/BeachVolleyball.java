/*Create a program called BeachVolleyball for dividing expenses in a group of people who rent a beach volleyball court.  
 * The program should first input the number of people, the hourly rate of a court, and the length of rental in full hours. 
 * Then the program should calculate how much each of them should pay. 
 * The program should display the sum with two decimals. 
 * • You can suppose that the user does not ever enter a zero.
	Enter the number of people: 5
	Enter the hourly rate: 20,50
	Enter the length of the rental (hours): 3
	
	Each of the 5 people should pay 12,30 euros.
 */
package basicCalculation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BeachVolleyball {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDeci = new DecimalFormat("0.00");

		System.out.print("Enter the number of people: ");
		int people = Integer.parseInt(input.nextLine());
		System.out.print("Enter the hourly rate: ");
		double rate = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter the length of the rental (hours): ");
		int totalHours = Integer.parseInt(input.nextLine());

		double totalPrice = rate * totalHours;

		double totalPerPerson = totalPrice / people;

		System.out
				.println("\nEach of the " + people + " people should pay " + twoDeci.format(totalPerPerson) + " euros.");

		input.close();

	}

}
