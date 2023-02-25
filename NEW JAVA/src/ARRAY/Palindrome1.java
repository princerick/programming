package ARRAY;

import java.util.Scanner;

public class Palindrome1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) 
		{
			 a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < size ; i++) 
		{
			int n = a[i];
			int copy = n;
			int rev=0;
			while(n>0) 
			{
				rev=rev*10 + n % 10;
				n /= 10;
			}
			if(copy == rev) 
			{
				System.out.println(copy+" is a Palindrome");
			}
		}
	}
} 


