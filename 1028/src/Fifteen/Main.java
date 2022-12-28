package Fifteen;

public class Main {

	public static void main(String[] args) {
		
	 LunchMenu child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.DUBU, PriceTable.SEAWEEDSOUP, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
	 LunchMenu child2 = new Child2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.DUBU, PriceTable.SEAWEEDSOUP, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);

	 System.out.println("Child 1's Cost of the Lunch" + child1.calculating());
	 System.out.println("Child 2's Cost of the Lunch" + child2.calculating());
	}

}
