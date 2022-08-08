package corejavapart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExpthrExcep {

	void read() throws NumberFormatException, IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter name");
	    String s=br.readLine();
	    System.out.println("Enter age");
	    int a=Integer.parseInt(br.readLine());
	    System.out.println("Enter percentage");
	    float b=Float.parseFloat(br.readLine());
	    System.out.println(s);
	    System.out.println(a);
	    System.out.println(b);
	}
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter name");
    String s=br.readLine();
    System.out.println("Enter age");
    int a=Integer.parseInt(br.readLine());
    System.out.println("Enter percentage");
    float b=Float.parseFloat(br.readLine());
    System.out.println(s);
    System.out.println(a);
    System.out.println(b);

	}

}
