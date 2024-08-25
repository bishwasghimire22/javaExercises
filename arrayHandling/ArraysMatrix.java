package arrayHandling;

public class ArraysMatrix {

	public static void main(String[] args) {
		int[][] m1 = { { 1, 2, 0 }, { 2, 3, 4 } };
		int[][] m2 = { { 3, 2, 5 }, { 6, 4, 3 } };
		int[][] m3 = { { 1, 1, 1, 1 }, { 3, 2, 3, 1 }, { 2, 2, 2, 2 } };
		int[][] m4 = { { 2, 2, 3, 3 }, { 2, 3, 1, 0 }, { 1, 2, 3, 4 } };

		printMatrixSum(m1, m2);

		System.out.println();

		printMatrixSum(m3, m4);

	}

	private static void printMatrixSum(int[][] a, int[][] b) {
		int[][] sum = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

	}

}
/*
 * Create a program called ArraysMatrix. First, copy/paste the main method below
 * to your program class. Then write the printMatrixSum method. The
 * printMatrixSum method should print the sum of two matrices.
 */
