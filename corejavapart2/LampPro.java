package corejavapart2;
class Lamp
{
	boolean isOn;
	void turnOn()
	{
		isOn=true;
		System.out.println("light is on--->"+isOn);
	}
	void turnOf()
	{
		isOn=false;
		System.out.println("light is off--->"+isOn);

	}
	
}
public class LampPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamp d=new Lamp();
		d.turnOn();
		d.turnOf();

	}


}
