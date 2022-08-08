package corejavapart2;

import java.util.Scanner;

class Area
{
	int len;
	int br;
	Area(int len,int br)
	{
	   this.len=len;
	   this.br=br;
	}
	void calArea()
	{
		System.out.println("length " +len+" breadth is " +br+ " Area of rectangle is---->"+(len*br));
	}
}

public class ConRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("enter length of rectangle");
       int a=s.nextInt();
       System.out.println("enter breath of rectangle");
       int b=s.nextInt();
       Area c=new Area(a,b);
      // System.out.println(c.len);
       //System.out.println(c.br);
       c.calArea();
	}

}
