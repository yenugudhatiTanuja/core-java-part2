package corejavapart2;

import java.util.Scanner;

public class MulArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][]=new int[10][10];
        
       // System.out.println("enter 2");
        Scanner s=new Scanner(System.in);
        System.out.println("enter array elements of 2*2 matrix");
        for(int i=0;i<2;i++)
        { 
        	for(int j=0;j<2;j++)
        	{
        		arr[i][j]=s.nextInt();
        	}
        }
        System.out.println("elements are");

        for(int i=0;i<2;i++)
        { 
        	for(int j=0;j<2;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        
	}

}
