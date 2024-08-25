package classAndObj1;

public class ClockTime {
	private int hours;
	private int minutes;

	public ClockTime() {
		this.hours = 0;
		this.minutes = 0;
	}

	public void add(int hoursToAdd, int minutesToAdd) {
		if (hoursToAdd < 0 || minutesToAdd < 0) {
			return;
		}
		int hour = this.hours + hoursToAdd;
		int minute = this.minutes + minutesToAdd;

		int totalHours = hour + (minute / 60);

		this.hours = totalHours % 24;
		this.minutes = minute % 60;
	}

	public String toString() {

		String formattedHours = (this.hours < 10) ? "0" + this.hours : String.valueOf(this.hours);
		String formattedMinutes = (this.minutes < 10) ? "0" + this.minutes : String.valueOf(this.minutes);

		return formattedHours + ":" + formattedMinutes;
	}
}
