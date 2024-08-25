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
/*Create a program called ObjectsSortWordPairs that first inputs pairs of English and Finnish words
from the user until he/she enters "OK" as the English word.
Next, the program should sort the list of WordPairs in alphabetical order by English word and print
the words as shown in the example output.
Finally, the program should sort the list of WordPairs in alphabetical order by Finnish word and print
the words as shown in the example output.
INSTRUCTION ( To be followed carefully! )
Reuse the WordPair class from a previous exercise.
• This time, you have to add something to the WordPair class to make WordPair objects
comparable. Please study the course materials to see how you can sort objects.
• After the modification, the WordPair class should still work properly with all the other programs
that use it.
• Create exactly one list of WordPairs. Do not create any other arrays or lists.
• Do not use lambda expressions in this exercise.
Hint: To speed up coding, you can also copy/paste some code from your
ObjectsTranslationArrayList program.*/
