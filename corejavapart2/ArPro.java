package corejavapart2;

import java.util.Scanner;

class CalPro
{
	 void add(int a,int b)
	{
		System.out.println("Addition is----->"+(a+b));
	}
	void sub(int a,int b)
	{
		System.out.println("Subtraction is----->"+(a-b));
	}
	void  mul(int a,int b)
	{
		System.out.println("multiplication is ---->"+(a*b));
	}
	void div(int a,int b)
	{
		if(a==0||b==0)
		{
			System.out.println("division is not possible");
		}
		else
		{
		System.out.println("divison is---->"+(a/b));
		}
	 }
	void  mod(int a,int b)
	{
		System.out.println("modulo is ---->"+(a%b));
	}
}
public class ArPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalPro f=new CalPro();
      Scanner s=new Scanner(System.in);
      System.out.println("enter a,b values performing operation");
      int a=s.nextInt();
      int b=s.nextInt();
      f.add(a, b);
      f.sub(a, b);
      f.mul(a, b);
      f.div(a, b);
      f.mod(a, b);
     /* System.out.println("enter two values + operation");
      int a=s.nextInt();
      int b=s.nextInt();
      f.add(a, b);
      System.out.println("enter two values - operation");
      int c=s.nextInt();
      int d=s.nextInt();
      f.sub(c, d);
      System.out.println("enter two values * operation");
      int e=s.nextInt();
      int g=s.nextInt();
      f.mul(e, g);
      System.out.println("enter two values / operation");
      int h=s.nextInt();
      int i=s.nextInt();
      f.div(h, i);
      System.out.println("enter two values % operation");
      int j=s.nextInt();
      int k=s.nextInt();
      f.mod(j, k);*/
      
	}

	

}
