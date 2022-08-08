package corejavapart2;

import java.util.Scanner;

class MainStudent
{
    static int srollno=12;
    String name;
	// Scanner s=new Scanner(System.in);
	// int srollno=s.nextInt();
	// String sname=s.next();
	 void display(String name)
	 {
		  //System.out.println("enter rollno and  name of student");
          System.out.println("roll no is ---->"+srollno);
          System.out.println("roll no is ---->"+name);

	 }
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainStudent d= new MainStudent();
		MainStudent d1= new MainStudent();

		System.out.println("enter rollno and  name of student");
		Scanner s=new Scanner(System.in);
		//int srollno=s.nextInt();
		//String name=s.next();
		d.display("tanu");
		d1.display("vanu");
		//System.out.println("enter rollno and  name of student");

	}

}
