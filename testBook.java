package se.liu.thebo717.calendar;

public class testBook
{
    public static void main(String[] args) {
	Cal calendar = new Cal();
	calendar.book(2022, "january", 27, 11,
		      30, 13, 00, "Lunch with mom");
	calendar.book(2010, "january", 30, 17,
		      00, 20, 15, "Evening course");
	calendar.book(2010, "february", 3, 17,
		      00, 20, 15, "Evening course");
	calendar.book(2010, "february", 2, 00,
		      30, 8, 15, "LAN");
	calendar.book(2010, "february", 19, 16,
		      59, 20, 15, "Birthday dinner");
	calendar.show();
    }
}
