package Children;

import Parents.Father;

public class Third {
	public Third()
	{
		
	}
	public void takeMoney(int money)
	{
		Father.Money = Father.Money - money;
		if(Father.Money < 0)
		{
			System.out.println("Non pay for Third");
		}
	}
}
