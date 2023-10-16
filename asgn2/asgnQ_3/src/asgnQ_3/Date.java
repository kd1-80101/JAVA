package asgnQ_3;

public class Date {
	private int month=0;
	private int day=0;
	private int year=0;

	public Date() {
		this(16, 2, 2000);
	}

	public Date(int day, int month, int year) {
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			System.out.println("Invalid month. Please enter a value between 1 and 12.");
		}
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			System.out.println("Invalid day. Please enter a value between 1 and 31.");
		}
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year) {
		if (year >= 0) {
			this.year = year;
		} else {
			System.out.println("Invalid year. Please enter a non-negative value.");
		}
	}

	public int getYear() {
		return year;
	}

	public void displayDate() {
		System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
	}

}
