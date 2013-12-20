package candy.controller;

import candy.model.MarshmallowCreature;

public class CandyController
{
	private MarshmallowCreature myCreature;
	
	public CandyController()
	{
		
	}
	
	public void start()
	{
		promptForInfo();
		makeMonster();
	}
	
	private void promptForInfo()
	{
		//decide what to put on the MarshmallowCreature.
		//Do no code this.
	}
	
	private void makeMonster()
	{
		//make a marshmallow creature that does not use the default constructor
		//code this.
		myCreature = new MarshmallowCreature("Afaula", 3, 2, 3, true);
	}
}
