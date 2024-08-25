package classesAndObj3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import classesAndObj1.WordPair;

public class ObjectsSortWordPairs {

	public static void main(String[] args) {
		ArrayList<WordPair> wp = new ArrayList<WordPair>();

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter an English word (quit ends): ");
			String englishWord = input.nextLine();

			if (englishWord.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.print("Enter a Finnish word: ");
			String finnishWord = input.nextLine();

			System.out.println();
			wp.add(new WordPair(englishWord, finnishWord));
		}
		System.out.println();
		Collections.sort(wp);
		for (WordPair arr : wp) {
			System.out.println(arr.getEnglishWord() + " = " + arr.getFinnishWord());
		}
		System.out.println();
		Collections.sort(wp, (a,b) -> a.getFinnishWord().compareToIgnoreCase(b.getFinnishWord()));
		for (WordPair pair : wp) {
			System.out.println(pair.getFinnishWord() + " = " + pair.getEnglishWord());
		}

		input.close();
	}

}
