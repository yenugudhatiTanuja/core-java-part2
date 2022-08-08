package corejavapart2;

import java.util.Scanner;

class A
{
	int rollno;
	String name;
    void display(int rollno,String name)
    {
    	System.out.println(rollno+" \n"+name);
    }
}
class B extends A {
	   //String name="tanu";
	   int msub1;
	   int msub2;
	   void avg(int msub1,int msub2)
	   {
		   System.out.println("avg is--->"+(msub1+msub2)/2);
	   }
}
class SingleIn{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("Enter id ");
		int a=d.nextInt();
		System.out.println("Enter name ");
		String b=d.next();
		System.out.println("enter marks of two subjects");
		int c=d.nextInt();
		int e=d.nextInt();
		System.out.println("student details");
        B s=new B();
        s.display(a,b);
        s.avg(c,e);
	}

}
