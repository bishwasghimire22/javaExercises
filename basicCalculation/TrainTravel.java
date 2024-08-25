/*Create a program called TrainTravel that first inputs
 * the number of train trips the user makes per month, the price of a single train ticket, 
 * and the price of the monthly season ticket (valid for one month). 
 * Then the program should determine which one is the cheaper option (buying a monthly season ticket or buying single tickets) 
 * and how much cheaper it is.  
 * The program should print one of the following texts: 
 * Buying a monthly season ticket is 99,00 euros cheaper. 
 * Buying single tickets is 99,00 euros cheaper. 
 * The total cost is the same.
		 Enter the number of train trips: 3
		 Enter the single ticket price: 20,50
		 Enter the monthly season ticket price: 80,00
		
		 Buying single tickets is 18,50 euros cheaper. 
 */
package basicCalculation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTravel {

	public static void main(String[] args) {
		DecimalFormat twoDeci = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of train trips: ");
		int noOfTrip = Integer.parseInt(input.nextLine());
		System.out.print("Enter the single ticket price: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter the monthly season ticket price: ");
		double seasonTicketPrice = Double.parseDouble(input.nextLine().replace(',', '.'));

		double totalPricePerTrip = noOfTrip * price;

		if (totalPricePerTrip < seasonTicketPrice) {
			System.out.println("\nBuying single tickets is " + twoDeci.format((seasonTicketPrice - totalPricePerTrip))
					+ " euros cheaper");

		} else if (totalPricePerTrip > seasonTicketPrice) {
			System.out.println("\nBuying a monthly season ticket is "
					+ twoDeci.format((totalPricePerTrip - seasonTicketPrice)) + " euros cheaper");
		} else {
			System.out.println("\nThe total cost is the same");
		}

		input.close();

	}

}
