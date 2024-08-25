package arrayHandling;

import java.util.Arrays;
import java.util.Random;

public class ArraysLotto {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] lotto = new int[7];
		int index = 0;

		while (index < 7) {
			int x = rand.nextInt(39) + 1;
			boolean isUnique = true;
			for (int i = 0; i < index; i++) {
				if (lotto[i] == x) {
					isUnique = false;
				}
			}
			if (isUnique) {
				lotto[index] = x;
				index++;
			}

		}
		Arrays.sort(lotto);
		for (int num : lotto) {
			System.out.print(num + " ");
		}

	}

}
/*Create a program called ArraysLotto that generates 7 unique lotto numbers (no duplicate numbers
allowed) and shows them in ascending order. Each lotto number is a random integer between 1 and
39.
You can generate pseudo-random integers as below. NB! You should create exactly one random
generator in the ArraysLotto program.
Random randomGenerator = new Random();
int x = randomGenerator.nextInt(5); */
