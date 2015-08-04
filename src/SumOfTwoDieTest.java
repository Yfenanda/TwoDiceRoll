/****************************************
 * Unit Test for RollTwoDie()
 * One test to check RollTwoDie() is between
 * 0 and 12 inclusive.
 * 
 * 
 * 
 ****************************************/
import static org.junit.Assert.*;

import org.junit.Test;


public class SumOfTwoDieTest {

	@Test
	public void testRollTwoDie() {
		SumOfTwoDie test = new SumOfTwoDie();
		assertTrue("Value found less than 0 or greater than 12",
				   ((0<=test.rollTwoDie())&&(test.rollTwoDie()<=12)));
	}

}
