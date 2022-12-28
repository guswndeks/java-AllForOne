package Aladin;

import Children.First;
import Children.Second;
import Children.Third;
import Parents.Father;

public class STATIC {

	public static void main(String[] args) {
		First first = new First();
		first.takeMoney(100);
		
		Second second = new Second();
		second.takeMoney(100);
		
		Third third = new Third();
		third.takeMoney(100);
		
		System.out.println("Money : " + Father.Money);
		
	}

}
