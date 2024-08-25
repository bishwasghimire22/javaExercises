package methods;

import java.util.Scanner;

public class MethodsRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first value: ");
		int num1 = Integer.parseInt(input.nextLine());

		System.out.print("Enter last value: ");
		int num2 = Integer.parseInt(input.nextLine());
		
		System.out.println();
		printRange(num1, num2);

		input.close();

	}

	private static void printRange(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");

		}
	}

}
/*
 * Create a program called MethodsRange that has a method called printRange. The
 * printRange method should take the first and last integer to be printed as
 * parameters. Then the method should print all integers between the first
 * integer and last integer. The main method should first input the first and
 * last integer from the user and then call the printRange method with the
 * inputted values.
 */