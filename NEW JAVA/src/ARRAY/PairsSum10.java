package ARRAY;

import java.util.Scanner;

public class PairsSum10 {
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
		for(int i = 0 ; i < a.length ; i++) 
		{
			for(int j = i+1 ; j < a.length ; j++) 
			{
				if(a[i] + a[j] == 10)
				{
					System.out.println(a[i]+"+"+a[j]+"=10");
				}
			}
		}
	}
}
