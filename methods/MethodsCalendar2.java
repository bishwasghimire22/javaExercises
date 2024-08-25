package methods;

import java.time.LocalDate;
import java.util.Scanner;

public class MethodsCalendar2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = Integer.parseInt(input.nextLine());

		System.out.print("Enter month: ");
		int month = Integer.parseInt(input.nextLine());

		System.out.println();

		printCalander(year, month);
		input.close();

	}

	private static void printCalander(int year, int month) {
		String[] months = { "Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu", "Kesäkuu", "Heinäkuu",
				"Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu" };

		LocalDate myDate = LocalDate.of(year, month, 1);
		int daysInMonth = myDate.lengthOfMonth();
		int dayOfWeek = myDate.getDayOfWeek().getValue();

		System.out.println(" > " + months[month - 1] + " " + year + " < ");
		System.out.println(" Ma Ti Ke To Pe La Su");

		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= daysInMonth; i++) {
			System.out.printf("%3d", i);
			if ((dayOfWeek + i - 1) % 7 == 0) {
				System.out.println();
			}
		}
	}

}
/*
 * Create a program called MethodsCalendar that has a method called
 * printCalendar. The method should take month number and year as parameters and
 * print a one-month calendar in Finnish. See the example output below for more
 * details. The main method should first input year and month number from the
 * user and then call the printCalendar method.
 */
