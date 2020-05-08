package kata.impl;

public class ExtendedUserStory extends LeapYear {

	@Override
	public boolean isLeap(int year) {
		// TODO Auto-generated method stub
		boolean result = super.isLeap(year);

		// second story
		if (year > 3999) {

			if (year % 4000 == 0) {
				result = false;
			}
		}
		return result;
	}

}
