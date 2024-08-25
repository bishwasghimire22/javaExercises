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
/*Create a program called MethodsCalendar that has a method called printCalendar. The method
should take month number and year as parameters and print a one-month calendar in Finnish. See
the example output below for more details.
The main method should first input year and month number from the user and then call the
printCalendar method.
INSTRUCTION (please read the below carefully)
You can use the lookup array below to display the month name based on the month number.
String[] months = {"Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu",
 "Kesäkuu", "Heinäkuu", "Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu"};
You can use the LocalDate class to create a date object. In the example below, the date is
1 December 2021.
LocalDate myDate = LocalDate.of(2021, 12, 1);
You can determine the number of days in a month as below.
int daysInMonth = myDate.lengthOfMonth();
You can determine the day of week as below (1 = Monday , 2 = Tuesday, ... )
int dayOfWeek = myDate.getDayOfWeek().getValue();
In this exercise, the easiest way to print a day number is as below. The "%3d" format specifier
means a minimum width of 3 spaces, which will be right-justified.
System.out.printf("%3d", day);
NB! You can write one for loop to print the first line of day numbers only. Then you can write
another loop to print the other lines of day numbers.
NB! Please notice that there is one leading space on each calendar line. That is, all day numbers
can be printed with the same format specifier*/
