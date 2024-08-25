package arrayHandling;

import java.util.Arrays;

public class ArraysLibrary {

	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;

	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

	public static double mean(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}
		double mean = (double) sum / arr.length;
		return mean;

	}

	public static double median(int[] arr) {
		int[] newArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(newArr);

		int mid = newArr.length / 2;

		if (newArr.length % 2 == 0) {
			double median = (newArr[mid] + newArr[mid - 1]) / 2.00;
			return median;
		} else {
			return newArr[mid];
		}

	}

	public static double standardDeviation(int[] arr) {
		double mean = mean(arr);
		double sqrdiff = 0;
		for (int i = 0; i < arr.length; i++) {
			double diff = (arr[i] - mean);
			sqrdiff += diff * diff;
		}
		double variance = sqrdiff / (arr.length - 1);
		return Math.sqrt(variance);

	}

	public static void sampleData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
