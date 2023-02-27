package ARRAY;

import java.util.Scanner;

public class IdenticalArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of 1st array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the 1st array elements ");
		for(int i = 0 ; i < size ; i++) 
		{
			 a[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter the size of 2nd array");
		int size1=sc.nextInt();
		int [] b = new int [size1];
		System.out.println("Enter the 2nd array elements ");
		for(int i = 0 ; i < size1 ; i++) 
		{
			 b[i] = sc.nextInt();
		}
		boolean flag = false;
		if(a.length == b.length)
		{
			for(int i = 0 ; i < a.length ; i++)
			{
				if(a[i] == b[i])
				{
					flag = true;
				}
				else
				{
					flag = false;
					break;
				}  
			}
			if(flag == true)
			{
				System.out.println("Array is identical");
			}
			else
			{
				System.out.println("Array is not identical");
			}
		}
		else
		{
			System.out.println("Array lengths are not equal");
		}
		
	}
}
