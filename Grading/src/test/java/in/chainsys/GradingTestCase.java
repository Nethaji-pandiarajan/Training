package in.chainsys;


import static org.junit.Assert.*;

import org.junit.Test;

public class GradingTestCase {

	@Test
	public void test1() {
		int s1= GradingApp.add1(20,10);
		assertEquals(30,s1);
		
	}

}
