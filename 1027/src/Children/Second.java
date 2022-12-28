package Children;

import Parents.Father;

public class Second {
	public Second()
	{
		
	}
	public void takeMoney(int money)
	{
		Father.Money = Father.Money - money;
		if(Father.Money < 0)
		{
			System.out.println("Non Pay for Second");
		}
	}
}
