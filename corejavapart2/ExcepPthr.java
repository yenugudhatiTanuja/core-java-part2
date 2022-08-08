package corejavapart2;

class Ess{

	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("eligible for voting");
		}
	}
}
class ExcepPthr
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ess d=new Ess();
       Ess.validate(20);
	}

}
