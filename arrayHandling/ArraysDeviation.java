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
