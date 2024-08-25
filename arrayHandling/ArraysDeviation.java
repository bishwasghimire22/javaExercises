package arrayHandling;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArraysDeviation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int n = Integer.parseInt(input.nextLine());
		DecimalFormat oneDeci = new DecimalFormat("0.0");

		int[] arr = new int[n];

		if (n < 4) {
			System.out.println("Sorry, at least 4 values required");
		} else {

			for (int i = 0; i < arr.length; i++) {
				System.out.print("Enter an integer: ");
				arr[i] = Integer.parseInt(input.nextLine());
			}

			System.out.println("\nn = " + n);
			System.out.println("Min: " + ArraysLibrary.min(arr));
			System.out.println("Max: " + ArraysLibrary.max(arr));
			System.out.println("Mean: " + oneDeci.format(ArraysLibrary.mean(arr)));
			System.out.println("Median: " + oneDeci.format(ArraysLibrary.median(arr)));
			System.out.println("Sample standard deviation: " + oneDeci.format(ArraysLibrary.standardDeviation(arr)));
			System.out.print("Sample data: ");
			ArraysLibrary.sampleData(arr);
		}

		input.close();

	}

}
/*First, create a class called ArraysLibrary for storing generic reusable methods. That is, the class is a
method library class and it does not have the main method. Instead, the class should have the
following methods: max, min, median, mean, and standardDeviation. Each method should take an
array of integers as parameter and return the appropriate result.
Then, create a program called ArraysDeviation that uses methods of the ArraysLibrary class. First,
the main method should ask the user how many values there are in the sample. Then, the main
method should input the values from the user and save them to an array. Finally, the program
should compute the required descriptive statistics from the sample data and display them. See the
example output for more details.
NB! The main method should call the methods max, min, median, mean, and standardDeviation
of the ArraysLibrary class to get the values to be printed.
NB! The minimum allowed sample size is 4. If the user enters less than 4 as the number of values,
then the program should just print the text "Sorry, at least 4 values required".
The sample standard deviation formula is the following:
s = sample standard deviation ∑ = sum of ...
xi = individual value in the sample x̅ = sample mean
n = number of values in the sample.
1. First, compute the sample mean. NB! For this purpose, call the mean method of your
ArraysLibrary class and assign the sample mean to a variable.
2. Then, for each value: subtract the sample mean and square the result. Compute the sum
of those squared differences.
3. Next, divide the sum of the squared differences by (n - 1)
4. Finally, use the Math.sqrt method to compute the square root of the quotient of the
division.
The median is the middle value in a sorted list of numbers. Examples:
4, 7, 8 median = 7 1, 3, 4, 6 median = (3 + 4) / 2 = 3.5*/
