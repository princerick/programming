package ARRAY;

import java.util.Scanner;

public class ElementsPresent {
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
		for(int j = 0 ; j < size ; j++)
		{
		for(int i = 0 ; i < size1 ; i++)
			{
				if(a[j] == b[i])
				{
					flag = true;
				}
				else
				{
					flag = false;
				}
			}
		}
		if(flag == true)
		{
			System.out.println("All the elements of 1st are present in 2nd array");
		}
		else
		{
			System.out.println("All the elements of 1st are not present in 2nd array");
		}
	}
}
