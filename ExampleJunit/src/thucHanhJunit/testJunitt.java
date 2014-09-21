package thucHanhJunit;

import junit.framework.TestCase;

public class testJunitt extends TestCase {
	public void testSum() {
		sumNumbers s = new sumNumbers(2,3);
		assertEquals(5,s.sum());
	}
	public void testInSum() {
		sumNumbers s = new sumNumbers(-1,3);
		assertEquals(3,s.sum());
		s = new sumNumbers(2,-1);
		assertEquals(2,s.sum());
	}
}
