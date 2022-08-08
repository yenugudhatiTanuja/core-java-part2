package corejavapart2;

  class Exam {
	void display()
	{
		System.out.println("running");
	}
}
class ExpFinal extends Exam
{
	void display()
	{
		System.out.println("run id ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
        ExpFinal d=new ExpFinal();
        d.display();
	}
}
/*public class ExpFinal
{
    /*final variable
	final int i=40;
	void display()
	{
		i=100;
		//System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ExpFinal d=new ExpFinal();
        d.display();
	}/*

}*/
