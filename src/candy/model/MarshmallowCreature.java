package candy.model;

public class MarshmallowCreature
{
	// Declaration section
	private String name;
	private int eyes;
	private int legs;
	private int arms;
	private boolean hasButton;
	
	//setters
		public void setName(String name)
		{
			this.name = name;
		}
		
		public void seteyes(int eyes)
		{
			this.eyes = eyes;
		}
		
		public void setlegs(int legs)
		{
			this.legs = legs;
		}
		
		public void setarms(int arms)
		{
			this.arms = arms;
		}
		
		public void sethasButton(boolean hasButton)
		{
			this.hasButton = hasButton;
		}
		
		//getters
		public String getName()
		{
			return name;
		}
		
		public int getEyes()
		{
			return eyes;
		}
		
		public int getLegs()
		{
			return legs;
		}
		
		public int getArms()
		{
			return arms;
		}
		
		public boolean getHasButton()
		{
			return hasButton;
		}
	
	
	
	
	/**
	 * Default constructor - should not be used
	 */
	public MarshmallowCreature()
	{
		name = "Monster";
		eyes = 5;
		legs = 3;
		arms = 3;
		hasButton = true;
	}
	
	/**
	 * Create a MarshmallowCreautre
	 * @param name The name of the creature.
	 * @param eyes The number of eyes the creature has.
	 * @param legs The number of legs the creature has.
	 * @param arms The number of arms the creature has.
	 * @param hasButton Whether or not the creature has a button.
	 */
	public MarshmallowCreature(String name, int eyes, int legs, int arms, boolean hasButton)
	{
		this.name = name;
		this.eyes = eyes;
		this.legs = legs;
		this.arms = arms;
		this.hasButton = hasButton;
	}
	

}

