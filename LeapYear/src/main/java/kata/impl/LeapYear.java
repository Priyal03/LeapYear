package kata.impl;

public class LeapYear {

	public boolean isLeap(int year) {

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

		}

		return leap;
	}

	private  boolean checkDivisibility(int year, int num) {
		// TODO Auto-generated method stub
		return (year%num==0);
	}

	private  boolean isDivisibleBy400(int year) {
		// TODO Auto-generated method stub
		return checkDivisibility(year, 400);
	}

	private  boolean isDivisibleBy100(int year) {
		// TODO Auto-generated method stub
		return checkDivisibility(year, 100);
	}

	private  boolean isDivisibleBy4(int year) {
		// TODO Auto-generated method stub
		return checkDivisibility(year,4);
	}
}
