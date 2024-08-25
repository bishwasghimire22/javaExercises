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
