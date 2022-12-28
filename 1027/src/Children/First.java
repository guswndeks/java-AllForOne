package Children;

import Parents.Father;

public class First {
	public First()
	{
		
	}
	public void takeMoney(int money)
	{
		Father.Money = Father.Money - money;
		if(Father.Money < 0)
		{
			System.out.println("Non pay for First");
		}
	}

}
