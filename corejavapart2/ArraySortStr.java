package corejavapart2;

import java.util.Arrays;
import java.util.Scanner;
public class ArraySortStr {
       public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=s.nextInt();
        System.out.println("enter array elements");
        String arr[]=new String[n];
        String temp=null;
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.next();
        }
        System.out.println("the elements are");
        for(int i=0;i<n;i++)
        {
        	System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n-i;j++)
        	{
        		if(arr[i].compareTo(arr[j])>0)
        		{
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}	
        }
       // Arrays.sort(arr);
        System.out.println("After sorting");
        for(String e:arr)
        {
        	System.out.println(e);
        }
       
	}
}

