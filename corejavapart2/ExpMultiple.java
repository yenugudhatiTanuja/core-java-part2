package corejavapart2;
interface test1
{
	int i=10;
	void display();
}
interface test2
{
	int x=30;
	void display();
}
public class ExpMultiple implements test1,test2 {

	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("ExpMultiple");
		System.out.println(test1.i);
		System.out.println(test2.x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ExpMultiple d=new ExpMultiple();
      d.display();
	}

}
