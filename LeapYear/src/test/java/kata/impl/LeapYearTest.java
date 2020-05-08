package kata.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import kata.impl.LeapYearClient;;

public class LeapYearTest {

	boolean result;
	
	@Test
	public void when2000isLeap() {
		result=LeapYearClient.isLeap(2000);
		assertTrue(result);
	}
	
	@Test
	public void when2001isNotLeap() {
		result=LeapYearClient.isLeap(2001);
		assertFalse(result);
	}
	
	@Test
	public void when2002isNotLeap() {
		result=LeapYearClient.isLeap(2002);
		assertFalse(result);
	}
	
	@Test
	public void when2003isNotLeap() {
		result=LeapYearClient.isLeap(2003);
		assertFalse(result);
	}
	
	@Test
	public void when2100isNotLeap() {
		result=LeapYearClient.isLeap(2100);
		assertFalse(result);
	}
	
	@Test
	public void when1851isNotLeap() {
		result=LeapYearClient.isLeap(1851);
		assertFalse(result);
	}
	
	@Test
	public void when1852isLeap() {
		result=LeapYearClient.isLeap(1852);
		assertTrue(result);
	}
	
	//Extended User Story No. 2
	@Test
	public void when4000isNotLeap() {
		result=LeapYearClient.isLeap(4000);
		assertFalse(result);
	}
	
	@Test
	public void when4004isLeap() {
		result=LeapYearClient.isLeap(4004);
		assertTrue(result);
	}
}
