package Fifteen;

// Only eat Dessert the Banana//
public class Child1 extends LunchMenu{
	public Child1(int rice, int bulgogi, int dubu, int seaweedsoup, int banana, int milk, int almond)
	{
		super(rice,  bulgogi,  dubu,  seaweedsoup,  banana, milk, almond);
	}
	
	public int calculating()
	{
		return rice + bulgogi + dubu + seaweedsoup + banana ;
	}

}
