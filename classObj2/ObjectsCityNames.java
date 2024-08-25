package classObj2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsCityNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<String> cityArray = new ArrayList<String>();
		String cityName = "";

		while (true) {
			System.out.print("Enter city name: ");
			cityName = input.nextLine();

			if (cityName.equalsIgnoreCase("Quit")) {
				break;
			}
			cityArray.add(cityName.toUpperCase());
		}

		Collections.sort(cityArray);
		System.out.println();

		for (String city : cityArray) {
			System.out.println(city);
		}

		input.close();

	}

}
/*
 * Create a program called ObjectsCityNames that first inputs city names from
 * the user until the user decides to quit by entering "quit". Then, the program
 * should print the city names in uppercase in alphabetical order. Use the sort
 * method of the Collections class.
 */
