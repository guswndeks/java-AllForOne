package SixTeen;

public class Main {

	public static void main(String[] args) {
		Car carLowGrade = new CarLowGrade(CarSpec.COLOR_BLUE, CarSpec.TIRE_NORMAL, CarSpec.DISPLACEMENT_2000, CarSpec.HANDLE_NORMAL);
		Car carHighGrade = new CarHighGrade(CarSpec.COLOR_RED, CarSpec.TIRE_WILD, CarSpec.DISPLACEMENT_2200, CarSpec.HANDLE_POWER);
		
		carLowGrade.getSpec();
		carHighGrade.getSpec();
	}

}
