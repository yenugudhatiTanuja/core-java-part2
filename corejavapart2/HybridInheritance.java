package corejavapart2;
class E
{
	public void display()
	{
		System.out.println("E");
	}
}
class F extends E
{
	public void  display()
	{
		System.out.println("F");
	}
}
class G extends E
{
	public void display()
	{
		System.out.println("G");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       E  d=new G();
       d.display();
       E e=new F();
       e.display();
	}

}
