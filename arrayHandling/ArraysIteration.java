package arrayHandling;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIteration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter an integer: ");
			arr[i] = Integer.parseInt(input.nextLine());
		}
		/*
		 * int[] newArr = Arrays.copyOf(arr, arr.length); Arrays.sort(newArr);
		 * 
		 * System.out.println(); for (int i = newArr.length - 1; i >= 0; i--) {
		 * System.out.print(newArr[i] + " "); }
		 */
		Arrays.sort(arr);

		System.out.println();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		input.close();

	}

}
/*
 * Create a program called ArraysIteration that first inputs five integers from
 * the user and saves them in an array. Then the program should print the
 * integers in descending order on a single line.
 */