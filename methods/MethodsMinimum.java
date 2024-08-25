package methods;

import java.util.Scanner;

public class MethodsMinimum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int num1 = Integer.parseInt(input.nextLine());

		System.out.print("Enter second integer: ");
		int num2 = Integer.parseInt(input.nextLine());

		System.out.print("Enter third integer: ");
		int num3 = Integer.parseInt(input.nextLine());

		int result = minimum(num1, num2, num3);

		System.out.println("\nThe minimum value is " + result);

		input.close();

	}

	private static int minimum(int a, int b, int c) {
		int result = Math.min(Math.min(a, b), c);
		return result;
	}

}
/*
 * Create a program called MethodsMinimum that has a method called minimum that
 * takes three integers as parameters. The method should return the smallest of
 * the three integers. The main method should first input three integers from
 * the user and then call the minimum method. Finally, the main method should
 * print the value that the minimum method has returned. The minimum method
 * should not print anything.
 */
