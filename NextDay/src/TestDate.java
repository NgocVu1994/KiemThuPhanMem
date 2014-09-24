import static org.junit.Assert.*;

import org.junit.Test;


public class TestDate {

	@Test
	public void test() {
		String s;
		Date d = new Date(24,9,2014);
		s = d.nextDate();
		assertEquals("25/9/2014",s);
		
	}
	@Test
	public void test1() {
		String s;
		Date d = new Date(30,10,1994);
		s = d.nextDate();
		assertEquals("31/10/1994",s);
	}
	

}
