package corejavapart2;
interface Az
{
	int i=9;
	default void display11() {
		System.out.println(i);
	}
}
interface Ay extends Az
{
	void display();
}
interface Ax extends Az
{
	void display1();
}
class Aw implements Ay,Ax
{

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Ax class");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Ay class ");
	}
	
}
public class NewInheritEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Aw s= new Aw();
        s.display();
        s.display1();
        s.display11();
	}

}
