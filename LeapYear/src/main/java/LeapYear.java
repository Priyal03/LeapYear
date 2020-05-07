import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		if (isLeap(year)) {
			System.out.println("Yey! you can plan your holiday on 29th February of " + year);
		} else {
			System.err.println("Sorry! not a leap year this year " + year);
		}
	}

	public static boolean isLeap(int year) {

		boolean leap = false;

		// when following Julian calendar
		if (year < 1583) {
			if (year % 4 == 0) {
				leap = true;
			} else
				leap = false;
		}
		// when following Gregorian calendar
		else {

			if (year % 4 == 0) {

				if (year % 100 == 0) {

					// first condition
					if (year % 400 == 0)
						leap = true;
					else
						leap = false; // second statement
				} else
					leap = true; // third condition
			} else
				leap = false; // fourth statement

			// second story
			if (year > 3999) {

				if (year % 4000 == 0) {
					leap = false;
				}
			}
		}

		return leap;
	}
}
