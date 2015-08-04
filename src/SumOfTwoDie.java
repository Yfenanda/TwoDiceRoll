/****************************************************
 * SumOfTwoDie Class
 * Two properties:  die1 and die2 of RandomDiceValue type
 * One Method:		rollTwoDie() no parameters, returns
 * 					sum of two die rolls					 
 * 
 * 
 * 
 *****************************************************/

public class SumOfTwoDie {

	private RandomDiceValue die1 = new RandomDiceValue();
	private RandomDiceValue die2 = new RandomDiceValue();
	
	public int rollTwoDie(){
		
	return die1.roll() + die2.roll();
	}
	
	 
	
	
}
