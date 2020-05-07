
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;;

public class LeapYearTest {

	boolean result;
	
	@Test
	public void when2000isLeap() {
		result=LeapYear.isLeap(2000);
		assertTrue(result);
	}
	
	@Test
	public void when2001isNotLeap() {
		result=LeapYear.isLeap(2001);
		assertFalse(result);
	}
	
	@Test
	public void when2002isNotLeap() {
		result=LeapYear.isLeap(2002);
		assertFalse(result);
	}
	
	@Test
	public void when2003isNotLeap() {
		result=LeapYear.isLeap(2003);
		assertFalse(result);
	}
	
	@Test
	public void when2100isNotLeap() {
		result=LeapYear.isLeap(2100);
		assertFalse(result);
	}
	
	@Test
	public void when1851isNotLeap() {
		result=LeapYear.isLeap(1851);
		assertFalse(result);
	}
	
	@Test
	public void when1852isLeap() {
		result=LeapYear.isLeap(1852);
		assertTrue(result);
	}
	
	@Test
	public void when4000isNotLeap() {
		result=LeapYear.isLeap(4000);
		assertFalse(result);
	}
	
	@Test
	public void when4004isLeap() {
		result=LeapYear.isLeap(4004);
		assertTrue(result);
	}
}
