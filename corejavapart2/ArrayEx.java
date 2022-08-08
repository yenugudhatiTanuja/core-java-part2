package corejavapart2;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=s.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];

       /* int arr[]= {21,22,23,24,25};
		int[] age= {22,23,24,25,26};
        System.out.println("Accessing array elements");
        System.out.println("first element--->"+age[0]);
        System.out.println("second element--->"+age[1]);
        System.out.println("third element--->"+age[2]);
        System.out.println("fourth element--->"+age[3]);
        System.out.println("first element--->"+age[4]);
    	System.out.println("Accesing elements using for loop");
        for(int i=0;i<=arr.length-1;i++)
        {
        	System.out.println(arr[i]);
        }*/
		System.out.println("enter array elements");
		for(int i=0;i<=n-1;i++)
		{
			arr1[i]=s.nextInt();
		}
		for(int i=0;i<=n-1;i++)
		{
			arr2[i]=arr1[i];
		}
		for(int i=0;i<=n-1;i++)
	    {
	        	System.out.println(arr1[i]);
	     }
	}

}
