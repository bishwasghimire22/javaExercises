package arrayHandling;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of city names: ");
		int n = Integer.parseInt(input.nextLine());

		String[] cityArray = new String[n];

		for (int i = 0; i < cityArray.length; i++) {
			System.out.print("Enter city name: ");
			cityArray[i] = input.nextLine();
		}
		Arrays.sort(cityArray);
		System.out.println();

		System.out.print(cityArray[0] + " ");
		for (int i = 1; i < cityArray.length; i++) {
			if (!cityArray[i].equals(cityArray[i - 1])) {
				System.out.print(cityArray[i] + " ");
			}
		}

		input.close();

	}

}
/*
 * Create a program called ArraysCities. The program should first input the
 * number of cities to be saved to an array. Then the program should create the
 * array, input cities, and save them to the array. Finally, the program should
 * find all distinct city names in the array and print them in alphabetical
 * order. See the example output for more details. NB! This is an exercise on
 * generic algorithm design. Therefore, do NOT create another array or
 * collection in your code. This time, you should tackle the problem with one
 * array.
 */
