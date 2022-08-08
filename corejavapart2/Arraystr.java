package corejavapart2;

import java.util.Scanner;

public class Arraystr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=s.nextInt();
        System.out.println("enter array elements");
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.next();
        }
        System.out.println("the elements are");
        for(int i=0;i<n;i++)
        {
        	System.out.println(arr[i]);
        }
	}

}
