/* Create a program called SalesProgram that first inputs the price of the product (integer), product name and discount (integer) from the user. 
 * Then the program should print the product's selling price as shown in the example output.
 * 	Enter price: 150
  	Enter product name: ukulele
  	Enter discount: 30

	The selling price of a ukulele is 120 euros.*/
package first_java_programs;

import java.util.Scanner;

public class SalesProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter price: ");
		int price = Integer.parseInt(input.nextLine());

		System.out.print("Enter product name: ");
		String name = input.nextLine();

		System.out.print("Enter discount: ");
		int discount = Integer.parseInt(input.nextLine());

		int sellingPrice = price - discount;

		System.out.println("\nThe selling price of a " + name + " is " + sellingPrice + " euros.");

		input.close();

	}

}
