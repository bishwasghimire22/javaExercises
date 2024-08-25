package classAndObj1;
public class ObjectsWordPairsProgram {

	public static void main(String[] args) {
		WordPair wp1 = new WordPair("school", "koulu");
		WordPair wp2 = new WordPair("student", "opiskelija");
		WordPair wp3 = new WordPair("textbook", "oppikirja");
		
		System.out.println(wp1.getEnglishWord() + " = " + wp1.getFinnishWord());
		System.out.println(wp2.getEnglishWord() + " = " + wp2.getFinnishWord());
		System.out.println(wp3.getEnglishWord() + " = " + wp3.getFinnishWord());

	}

}
/*First, create a new class called WordPair. The features of the WordPair class should be exactly as
shown in the diagram below. NB! The class should have no other fields or methods than shown in
the diagram. The WordPair class should not contain any code for inputting data from the user or
printing data.
Then, create a main program called ObjectsWordPairsProgram. In the program, create three
objects from the WordPair class and assign their references to reference variables. See the example
output for the English and Finnish words.
Finally, the program should print the words held by the WordPair objects as shown in the example
output. Use the get methods to get the English and Finnish words from the WordPair objects.*/
