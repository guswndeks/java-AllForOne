package SixTeen;

public class CarHighGrade extends Car {
private int tax = 1000;
	
	public CarHighGrade(String color, String tire, int displacement, String handle)
	{
		super(color,tire,displacement,handle);
	}
	
	public void getSpec()
	{
		System.out.println("***********************");
		System.out.println("color : " + color);
		System.out.println("tire : " + tire);
		System.out.println("displacement : " + displacement);
		System.out.println("handle : " + handle);
		
		if(displacement >= 2200) tax = 1500;
		System.out.println("Tax : " + tax );
		System.out.println("***********************");
	}

}
