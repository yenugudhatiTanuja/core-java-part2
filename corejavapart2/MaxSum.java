package corejavapart2;

import java.util.Scanner;

public class MaxSum {
	int sum1=0,sum2=0;
	int maxsum(int arr[],int size)
	{
		if(size<0)
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i]<0)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				sum1=sum1+arr[i];
			}
			else
			{
				sum2=sum2+arr[i];
			}
		}
		if(sum1>sum2)
		{
            System.out.println("even sum is maximum");
	     	return sum1;
		}
		else
		{
			System.out.println("odd sum is maximum");
			return sum2;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++)
        {
        	arr[i]=s.nextInt();
        }
        MaxSum d= new MaxSum();
        int maxsum=d.maxsum(arr, size);
        System.out.println(maxsum);
	}

}
