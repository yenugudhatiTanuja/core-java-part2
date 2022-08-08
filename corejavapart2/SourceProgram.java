package corejavapart2;

import java.util.Scanner;

public class SourceProgram {
	 String checkName(String firstName, String lastName)
	{
		//if((firstName==null||firstName.isEmpty())&&(lastName==null)||(lastName.isEmpty()))
		 if((firstName.isBlank())&&(lastName.isBlank()))
		{
			System.out.println("Hello world");
		}
		return firstName+lastName;
	}

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	//String firstName=s.next();
	//String lastName=s.next();
	SourceProgram obj=new SourceProgram();
	String d=obj.checkName("","");
	System.out.println(d);

	}


}