package methods;

import java.util.Scanner;

public class MethodsTriplex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int n = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= n; i++) {
			System.out.println("triplex(" + i + ") = " + triplex(i));
		}

		input.close();

	}

	private static int triplex(int a) {
		int product = 1;
		for (int i = 1; i <= a; i++) {
			if (i % 3 == 1 || i == a) {
				product *= i;
			}
		}

		return product;
	}
}
/*
 * Create a program called MethodsTriplex that has a method called triplex that
 * takes a positive integer as parameter and returns the triplex of the integer.
 * The triplex method should not print anything. In pseudo mathematics, • The
 * triplex of 1 is 1. • The triplex of a positive integer X greater than 1 is
 * the product of X and every third positive integer less than X. • E.g.,
 * triplex(5) is 1 x 4 x 5 = 20, triplex (7) is 1 x 4 x 7 = 28 , and triplex(8)
 * is 1 x 4 x 7 x 8 = 224 The main method should first ask the user to enter a
 * positive integer. Then the main method should print all triplexes up to the
 * inputted integer. The main method should call the triplex method to determine
 * if an inputted integer is a triplex or not. Please use the for loop in the
 * main method.
 */
