/* Create a program called MealProgram that calculates the cost of a meal at a restaurant. 
 * The program should input the cost of the food, the tax rate, and the tip percentage (before tax) from the user. 
 * Then the program should calculate and print the total cost of the meal as shown in the example output.
 *  • The program should accept both comma and dot as decimal part separator. 
 *  	Enter the price of food: 20.00
		Enter the tax rate: 10.0
		Enter the tip percentage: 15.0

		The total cost is 25,00*/
package basicCalculation;

import java.util.Scanner;

public class MealProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of food: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter the tax rate: ");
		double taxRate = Double.parseDouble(input.nextLine().replace(',', '.')) / 100;
		System.out.print("Enter the price of food: ");
		double tip = Double.parseDouble(input.nextLine().replace(',', '.')) / 100;
		
		double taxAmt = (price * taxRate);
		double tipAmt = price * tip;
		double totalAmt = price + taxAmt + tipAmt;

		System.out.println("\nThe total cost is " + totalAmt);

		input.close();

	}

}
