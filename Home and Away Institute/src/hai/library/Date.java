package hai.library;

public class Date {
	private int day;
	private int month;
	private int year;

	// default constructor
	public Date() {
		day = 0;
		month = 0;
		year = 0;
	}

	// Primary constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

	}

	// Copy constructor
	public Date(Date date) {
		day = date.day;
		month = date.month;
		year = date.year;
	}

	// Mutator
	public void setDay(int day) {
		this.day = day;
	}

	// Accessor
	public int getDay() {
		return day;
	}

	// Mutator
	public void setMonth(int month) {
		this.month = month;
	}

	// accessor
	public int getMonth() {
		return month;
	}

	// Mutator
	public void setYear(int year) {
		this.year = year;
	}

	// Accessor
	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		String msg;
		msg = day + "/" + month + "/" + year;
		return msg;
	}
}
