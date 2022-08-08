package corejavapart2;
class Vehicle
{ 
	void vehicle()
	{
		System.out.println("vehicle name");
	}
}
class Car extends Vehicle
{
	void car()
	{
		System.out.println("car--->maruthi suzuki");
	}
}
class Bike extends Vehicle
{
	void bike()
	{
		System.out.println("bike ---->Bullet");
	}
}
class Bicycle extends Vehicle
{
	void bicycle()
	{
		System.out.println("bicycle---->ladyBoat");
	}
}
public class Hirerical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bicycle b=new Bicycle();
         Car c=new Car();
         Bike k=new Bike();
         b.vehicle();
         b.bicycle();
         k.vehicle();
         k.bike();
         c.vehicle();
         c.car();
         
        // k.vehicle();
         
	}

}
