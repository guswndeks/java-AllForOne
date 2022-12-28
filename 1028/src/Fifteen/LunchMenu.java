package Fifteen;

public abstract class LunchMenu {
	
	public int rice;
	public int bulgogi;
	public int dubu;
	public int seaweedsoup;
	
	
	public int banana;
	public int milk;
    public int almond;
    
    public LunchMenu(int rice, int bulgogi, int dubu, int seaweedsoup, int banana, int milk, int almond)
    {
    	this.rice = rice;
    	this.bulgogi = bulgogi;
    	this.dubu = dubu;
    	this.seaweedsoup = seaweedsoup;
    	
    	this.banana = banana;
    	this.milk = milk;
    	this.almond = almond;
    }
    
    public abstract int calculating();
    
}
