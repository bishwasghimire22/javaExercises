package methods;

public class MethodsWarmup {

	public static void main(String[] args) {
		printNumbers();

	}

	private static void printNumbers() {
		int i;
		for (i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for (i = 50; i >= 1; i--) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

}
/*
 * Create a program called MethodsWarmup that has a method called printNumbers.
 * The printNumbers method should print all positive even and odd numbers
 * between 1 and 50 as shown in the example output. The main method should call
 * the printNumbers method. Please use a for loop in your program.
 */