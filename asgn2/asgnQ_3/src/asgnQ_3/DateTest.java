package asgnQ_3;

public class DateTest {
	public static void main(String[] args) {
		Date date1 = new Date(16, 2, 2000);
		Date date2 = new Date(12, 15, 2012);
		Date date3 = new Date(13, 1, -1);
		System.out.print("Date 1: ");
		date1.displayDate();
		System.out.print("Date 2: ");
		date2.displayDate();
		System.out.print("Date 3: ");
		date3.displayDate();
	}
}
