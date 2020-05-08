package kata.impl;
import java.util.Scanner;

public class LeapYearClient {

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
		// TODO Auto-generated method stub
		
		LeapYear obj= null;
		
		if(year>3999) {
			obj=new ExtendedUserStory();
		}else {
			obj=new LeapYear();
		}
		
		return obj.isLeap(year);
	}

	

}
