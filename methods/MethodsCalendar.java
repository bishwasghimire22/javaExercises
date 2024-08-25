package methods;

import java.time.LocalDate;
import java.util.Scanner;

public class MethodsCalendar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = scanner.nextInt();

		System.out.print("Enter month: ");
		int month = scanner.nextInt();

		System.out.println();

		printCalendar(year, month);
		scanner.close();

	}

	private static void printCalendar(int year, int month) {
		String[] months = { "Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu", "Kesäkuu", "Heinäkuu",
				"Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu" };

		// Create a date object for the first day of the specified month and year
		LocalDate myDate = LocalDate.of(year, month, 1);

		// Determine the number of days in the month
		int daysInMonth = myDate.lengthOfMonth();

		// Determine the day of the week the month starts on (1 = Monday, ..., 7 =
		// Sunday)
		int dayOfWeek = myDate.getDayOfWeek().getValue();

		// Print the month and year
		System.out.println(" > " + months[month - 1] + " " + year + " <");
		System.out.println(" Ma Ti Ke To Pe La Su");

		// Print leading spaces for the first week
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("   ");
		}

		// Print the days of the month
		for (int day = 1; day <= daysInMonth; day++) {
			System.out.printf("%3d", day);
			if ((dayOfWeek + day - 1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();

	}

}
