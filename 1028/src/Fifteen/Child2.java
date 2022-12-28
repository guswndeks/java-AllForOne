package Fifteen;
 
// Only eat dessert the Milk and Almond//
public class Child2 extends LunchMenu{
	public Child2(int rice, int bulgogi, int dubu, int seaweedsoup,int banana, int milk, int almond)
	{
		super(rice, bulgogi, dubu, seaweedsoup, banana, milk, almond);
	}
	
	public int calculating()
	{
		return rice + bulgogi + dubu + seaweedsoup + milk + almond;
	}

}
