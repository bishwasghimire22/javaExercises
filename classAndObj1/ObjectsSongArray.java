package classAndObj1;

public class ObjectsSongArray {

	public static void main(String[] args) {
		Song[] arr = { new Song("Easy on Me", "Adele", 2021), new Song("Shivers", "Ed Sheeran", 2021),
				new Song("Holy Ghost Fire", "Larkin Poe", 2020) };
		System.out.println("=== List of songs ===");
		for (Song song : arr) {
			System.out.println(song.getArtist() + ": " + song.getName() + " (" + song.getYear() + ")");

		}

	}

}
/*
 * Create a program called ObjectsSongArray. The program is a variation of the
 * Objects Song Program exercise. Reuse the Song class (no modifications should
 * be needed) from the previous exercise and create an array of three Songs.
 * Then create three Song objects and save their references to the array. See
 * the example output for the song names etc. You can either use an array
 * initializer or create the Song objects separately. Finally, the program
 * should iterate the array and print a song list exactly as shown in the
 * example output. This time, use the getters to get data from the Song objects.
 * Hint: To make it easier, you can use the enhanced for loop to iterate the
 * array.
 */
