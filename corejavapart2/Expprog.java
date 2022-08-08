package corejavapart2;
class NameLength extends Exception 
{
	public String toString()
	{
		return "you have not enter either firstname or second name";
		
	}
}
public class Expprog {
   static void read(String firstname,String lastname) throws NameLength
    {
    	try
    	{
    		if(firstname==null && lastname==null)
    		{
    			throw new NameLength();
    		}
    		else
    		{
    			System.out.println(firstname+" "+lastname);
    		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
	public static void main(String[] args) throws NameLength {
		// TODO Auto-generated method stub
     // Expprog d=new Expprog();
      read("t", null);
	}

}
