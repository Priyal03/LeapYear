package kata.impl;
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
			if (isDivisibleBy4(year)) {
				leap = true;
			} else
				leap = false;
		}
		// when following Gregorian calendar
		else {

			if (isDivisibleBy4(year)) {

				if (isDivisibleBy100(year)) {

					// first condition
					if (isDivisibleBy400(year)) 
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
	private static boolean isDivisibleBy400(int year) {
		// TODO Auto-generated method stub
		return checkDivisibility(year, 400);
	}

	private static boolean isDivisibleBy100(int year) {
		// TODO Auto-generated method stub
		return checkDivisibility(year, 100);
	}

	private static boolean isDivisibleBy4(int year) {
		// TODO Auto-generated method stub
		return checkDivisibility(year,4);
	}

	private static boolean checkDivisibility(int year, int num) {
		// TODO Auto-generated method stub
		
		return (year%num==0);
	}

}
