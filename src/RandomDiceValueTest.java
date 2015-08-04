/*************************
 * Unit Tests for the RandomDiceValue class
 * Tests that the rolls are always between 0 and 6.
 * 
 ***********************/


import static org.junit.Assert.*;
import org.junit.Test;


public class RandomDiceValueTest {

	@Test
	public void testRoll() {
		RandomDiceValue someDie = new RandomDiceValue();
		assertTrue("some value greater than 6 was rolled", (someDie.roll()<=6));
		assertTrue("some value less than 0 was rolled", (someDie.roll()>=0));
	}

}
