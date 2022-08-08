package corejavapart2;

public class ProgramMethodOverriding {

		public String retString()
		{
		    //String s=name;
	    	return "Parent";
			
		}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
         SourceSubClass b=new SourceSubClass ();
         System.out.println(b.retString());
	}

}
class SourceSubClass extends ProgramMethodOverriding{
	public String retString()
	{
		System.out.println(super.retString());
		return "Child";
	}
}
