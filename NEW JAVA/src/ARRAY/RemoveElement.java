package ARRAY;

import java.util.Scanner;

//						remove element from particular index

public class RemoveElement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int size=sc.nextInt();
		int [] a=new int[size];
		System.out.println("Enter the array elements... ");
		for (int i = 0; i < size; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The array elements are... ");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter the reomving element");
		int ele=sc.nextInt();
//		int [] b = new int[size];
//		int x=0;
//		for (int i = 0; i < size; i++)
//		{
//	       if(a[i] != ele) 
//	       	{
//	    	   b[x]=a[i];
//	    	   x++;
//	       	}
//		}
		for (int i = 0; i < size; i++)
		{
	       if(a[i] != ele) 
	       	{
	    	   a[i]=a[i];
	       	}
	       else
	       {
	    	   a[i] = 0;
	    	   i++;
	       }
		}
		System.out.println("\nUpdated array elements are... ");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(a[i]+" ");
		}
}
}
