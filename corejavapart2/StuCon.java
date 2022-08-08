package corejavapart2;

import java.util.Scanner;

class Details
{
	String name;
	int stuid;
	int sub1,sub2,sub3;
	float avg;
	int sum;
	Details(int stuid,String name,int sub1,int sub2,int sub3)
	{
		this.name=name;
		this.stuid=stuid;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	void sum()
	{
		sum=sub1+sub2+sub3;
	}
	void avg()
	{
		avg=sum/3;
	}
	void display()
	{
		System.out.println("Name is --->"+name+"\nstudent id----->"+stuid);
		System.out.println("total marks----->"+sum+"\navg is ------>"+avg);
	}
}
public class StuCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("enter student id");
       int b=s.nextInt();
       System.out.println("enter name");
       String a=s.next();
      
      // System.out.println("enter student id");
       //int b=s.nextInt();
       System.out.println("Enter marks of 3 subjects");
       int c=s.nextInt();
       int d=s.nextInt();
       int e=s.nextInt();
       Details f=new Details(b,a,c,d,e);
       f.sum();
       f.avg();
       f.display();
	}

}
