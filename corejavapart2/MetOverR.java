package corejavapart2;

class Super {
	//int a;
	void add(int a,int b)
	{
		System.out.println(" super class "+(a+b));
	}
}
class Sub extends Super
{
	void add(int a,int b)
	{
		super.add(8,8);
		System.out.println(" sub class  "+(a+b));
	}
}
class MetOverR
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Sub d=new Sub();
      d.add(5,5);
      //d.add(8, 8);
	}

}
