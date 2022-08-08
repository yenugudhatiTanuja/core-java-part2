package corejavapart2;

public class Aexcep {

	/*public static void divide()
    {
    	int res=50/0;
    	System.out.println(res);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Aexcep d=new Aexcep();
        Aexcep.divide();
	}*/
	static void divide()
	{
		try
		{
			System.out.println("Try Block ::start");
			int val = 0;
			int val2 = 25;
			System.out.println(val2);
			System.out.println("Try Block ::End");	
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArthimeticException::DividebyZero");
		}
        finally {
        	System.out.println("outside try catch::Rest of the code");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Aexcep d=new Aexcep();
        Aexcep.divide();
	}
}
