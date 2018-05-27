package daysCalculator;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class testDaysCalculator {
	Calculator cal = new Calculator();
	@Test
	//tests when input dates are same year and month
	public void testMainSameYearMonth() {
		
		MyDate date1 = new MyDate("02/06/1983");
		MyDate date2 = new MyDate("22/06/1983");
	
		assertEquals(cal.dayswithinMonths(date1, date2), 19);
		
		//test leap year
		MyDate date3 = new MyDate("01/02/2012");
		MyDate date4 = new MyDate("29/02/2012");
		assertEquals(cal.dayswithinMonths(date3, date4), 27);
		
	}
	
	@Test
	//tests when two dates are the same year, different months
	public void testMainSameYear() {
		
		MyDate date1 = new MyDate("04/07/1984");
		MyDate date2 = new MyDate("25/12/1984");
	
		assertEquals(cal.dayswithinMonths(date1, date2) + cal.daysinMonths(date1, date2), 173);
		
		//test leap year
		MyDate date3 = new MyDate("01/02/2012");
		MyDate date4 = new MyDate("05/03/2012");
		assertEquals(cal.dayswithinMonths(date3, date4) + + cal.daysinMonths(date3, date4), 32);
	}
	
	@Test
	//tests when two dates are the same year, different months
	public void testMainDifferentYear() {
		
		MyDate date1 = new MyDate("04/07/1984");
		MyDate date2 = new MyDate("04/07/1983");
	
		assertEquals(cal.dayswithinMonths(date1, date2) + cal.daysinMonths(date1, date2), 365);
		
//		//test leap year
//		MyDate date3 = new MyDate("01/02/2012");
//		MyDate date4 = new MyDate("05/03/2012");
//		assertEquals(cal.dayswithinMonths(date3, date4) + + cal.daysinMonths(date3, date4), 32);
	}
	

}
