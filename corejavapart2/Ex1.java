package corejavapart2;

import java.util.Scanner;

public class Ex1 {
	//int c,d,food,travel;
	int savings;
	int saving(int salary,int shifts)
	{
		if(salary>8000)
		{
			System.out.println("salary too large");
		}
		else if(shifts<0)
		{
			System.out.println("shifts  too small");
		}
		else if(salary<0)
		{
			System.out.println("salary  too small");

		}
		else
		{
		  /*  c=(int)(salary/100)*2;//It returns the extra money for shift per day
		    d=shifts*c; //It tells the extra amount for all shifts
		    food=(int)(salary/100)*20;//cost for food
		    travel=(int)(salary/100)*30;//cost for travel
		    savings=(salary-food-travel)+d;*/
			savings=(salary-((salary/100)*50)+(((salary/100)*2)*shifts));
		}
		    return savings;
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter salary");
		int salary=s.nextInt();
		System.out.println("Enter how many shifts");
		int shifts=s.nextInt();
		Ex1 d=new Ex1();
		System.out.println("*****Pocket money******");
		int pocketmoney=d.saving(salary,shifts);
		System.out.println(pocketmoney);
				
       
	}

}
