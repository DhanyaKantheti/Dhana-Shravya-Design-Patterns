class House
{
	int windows,doors,rooms,hasStatues;
	boolean hasGarage,hasSwimmingPool,hasGarden;
	public House(int windows,int doors,int rooms)
	{
		this.windows=windows;
		this.doors=doors;
		this.rooms=rooms;
	}
	public House(boolean hasGarage,boolean hasSwimmingPool)
	{
		this.hasGarage=hasGarage;
		this.hasSwimmingPool=hasSwimmingPool;
	}
	public House(int hasStatues,boolean hasGarden)
	{
		this.hasStatues=hasStatues;
		this.hasGarden=hasGarden;
	}
	
}
class SubHouse1 extends House
{
	boolean hasGarage,hasSwimmingPool;
	public SubHouse1(int windows, int doors, int rooms) {
		super(windows, doors, rooms);
		// TODO Auto-generated constructor stub
	}
	public SubHouse1(boolean hasGarage,boolean hasSwimmingPool)
	{
		super(hasGarage,hasSwimmingPool);
		this.hasGarage=hasGarage;
		this.hasSwimmingPool=hasSwimmingPool;
	}
	
}
class SubHouse2 extends House
{
	int hasStatues;
	boolean hasGarden;
	public SubHouse2(int windows, int doors, int rooms) {
		super(windows, doors, rooms);
		// TODO Auto-generated constructor stub
	}
	public SubHouse2(int hasStatues,boolean hasGarden)
	{
		super(hasStatues,hasGarden);
		this.hasStatues=hasStatues;
		this.hasGarden=hasGarden;
	}
	
}
public class BuilderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h1=new House(4,2,4);
		House sh=new SubHouse1(true,false);
		House s2=new SubHouse2(0,false);
		System.out.println("House1:");
		System.out.println("No. of doors: "+h1.doors);
		System.out.println("No. of windows: "+h1.windows);
		System.out.println("No. of rooms: "+h1.rooms);
		System.out.println("Has Swimming pool(true/false): "+sh.hasSwimmingPool);
		System.out.println("Has Garden(true/false): "+s2.hasGarden);

	}

}
