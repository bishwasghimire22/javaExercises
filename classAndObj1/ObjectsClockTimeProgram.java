package classAndObj1;

import java.util.Scanner;

public class ObjectsClockTimeProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ClockTime clockTime = new ClockTime();
		System.out.print("Enter hours to add: ");
		int hours = Integer.parseInt(input.nextLine());
		
		while (hours >= 0) {
			System.out.print("Enter minutes to add: ");
			int minutes = Integer.parseInt(input.nextLine());
			
			clockTime.add(hours, minutes);
			
			System.out.println(clockTime + "\n");
			System.out.print("Enter hours to add: ");
			
			hours = Integer.parseInt(input.nextLine());
		}
		input.close();

	}

}
/*This time, we want to represent robust clock times. In the real world, a valid clock time is between
00:00 and 23:59
Create a new class called ClockTime that represents clock time.
The additional business rules are the following:
• Initially, the clock time is always 00:00
• The add method rolls the time forward by the given number of hours and minutes. If either
parameter value is negative, then the time should not change.
• The toString method returns the textual representation of the clock time in the "hh:mm" format
Hint: You can use if statements to determine if you need to add a leading zeros.
NB! Please use the ready-made program class below to test your ClockTime class. Do not modify
the program class at all.*/
