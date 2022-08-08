package corejavapart2;

import java.util.Scanner;

public class MatrixMul1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[100][100];
        int arr1[][]=new int[100][100];
        int arr2[][]=new int[100][100];

       // System.out.println("enter 2");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no.of the rows matrix1");
        int n=s.nextInt();
        System.out.println("Enter no.of the columns matrix1");
        int m=s.nextInt();
        System.out.println("enter no.of rows of matrix2");
        int r=s.nextInt();
        System.out.println("enter no.of columns of matrix2");
        int p=s.nextInt();
        if(p!=n)
        {
        	System.out.println("multiplication is not possible");
        }
        else
        {
             System.out.println("enter array elements for " +n+"*"+n+ " matrix1");
            for(int i=0;i<n;i++)
            { 
        	    for(int j=0;j<m;j++)
        	    {
        		arr[i][j]=s.nextInt();
        	    }
             }
            System.out.println("enter array elements for" +n+"*"+n+ " matrix2");
            for(int i=0;i<r;i++)
           { 
        	   for(int j=0;j<p;j++)
        	   {
        		arr1[i][j]=s.nextInt();
        	   }
           }
           System.out.println("****After Multiplication matrix is****");
           for(int i=0;i<r;i++)
           {
        	   for(int j=0;j<n;j++)
        	   {
        		   arr2[i][j]=0;
        		   for(int k=0;k<m;k++)
        		   {
        		    arr2[i][j]+=arr[i][k]*arr1[k][j];
        		
        		   }
        		   System.out.print(arr2[i][j]+" ");
        	    }
        	System.out.println();
           }
        }
	}

}
	