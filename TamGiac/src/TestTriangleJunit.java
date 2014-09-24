import static org.junit.Assert.*;

import org.junit.Test;


public class TestTriangleJunit {

	@Test
	public void test() {
		TamGiac a = new TamGiac();
		String s = a.triangle(5, 5, 5);
		assertEquals("tam giac deu",s);
		}
	@Test
	public void test1() {
		TamGiac a = new TamGiac();
		String s = a.triangle(1, 2, 3);
		assertEquals("khong la tam giac",s);
		}
	@Test
	public void test2() {
		TamGiac a = new TamGiac();
		String s = a.triangle(5, 5, 9);
		assertEquals("tam giac can",s);
		}
	}
		
	


