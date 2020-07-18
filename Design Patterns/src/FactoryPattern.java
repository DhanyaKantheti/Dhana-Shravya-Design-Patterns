interface Transport
{
	void deliver();
}
class Truck implements Transport
{
	public void deliver()
	{
		System.out.println("Truck delivers by land in a box");
	}
}
class Ship implements Transport
{

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("Ship delivers by sea in a container");
		
	}
	
}
public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck t=new Truck();
		t.deliver();
		Ship s=new Ship();
		s.deliver();
		Transport tt=new Truck();
		tt.deliver();

	}

}
