package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElements {

//						print the missing elements
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of elements you want");
		int n = sc.nextInt();
		int [] a = new int [n];
		System.out.println("Enter your elements");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) 
		{  
				if(i != a.length - 1)
				{
					int n1 = a[i];
					while(n1 != a[i+1])
					{
						if(n1+1 == a[i+1]);
						else
						{
							System.out.println(n1+1+" is missing");
						}
						n1++;
					}
				}
		}
	}
}
