package corejavapart2;
interface Part1
{
	default void display() {
	System.out.println("part1");
	}
	
	
}
interface Part2 extends Part1
{
	/*default void display()
	{
		System.out.println("part2");
	}*/
}
interface Part3 extends Part1
{
	/*default void display()
	{
		System.out.println("part3");
	}*/
}
class MultipleExpro implements Part2, Part3 {


	//@Override
	/*public void display() {
		// TODO Auto-generated method stub*/
		//Part2.super.display();
		/*Part3.super.display();
		//Part1.super.display();
		System.out.println("**************");
	}*/
//}
//class MultipleExpro
//{
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
           MultipleExpro d=new MultipleExpro();
           //((Part1) d).display();
           d.display();
	}

}
