/****************************************************
 * RandomDiceValue Class
 * contains no properties and only one method
 * 
 * rol():  no parameters.  Returns an int value
 * 		   between 1 and 6 inclusive.
 * 
 * 
 * 
 *****************************************************/


import java.util.Random;

public class RandomDiceValue {

	
	public int roll(){
		
		return (int) (Math.random() * 6 +1);
		
	}
	
}
