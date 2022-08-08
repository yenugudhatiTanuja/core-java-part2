package corejavapart2;

import java.util.Scanner;

public class MethodOverL {
	 int a,b,c;
	 double sum(int a,double d)
	 {
	   // System.out.println(a+d);
		return a+d;
	 }
	 int sum(int a,int b,int c)
	 {
		return a+b+c;
		// System.out.println(a+b+c);
	 }
	 int sum(int a, float b)
	 {
		 //System.out.println(a+b);
		return (int) (a+b);
	 }
	 double sum(double a,double b)
	 {
		 return a+b;
		// System.out.println(a+b);
	 }
	 void sum(String s, String y)
	 {
		 System.out.println(s+y);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Scanner s=new Scanner(System.in);
        MethodOverL s=new MethodOverL();
        System.out.println("int and double");
       double  n=s.sum(10, 20.555);
       System.out.println(n);;
        System.out.println("3 integer"+s.sum(10, 20, 30));
        System.out.println(" inter and float" +s.sum(10, 20.5f));
        System.out.println("float and float"   +s.sum(10.555, 20.555));
        s.sum("tanu","tanuja");


      
	}

}
