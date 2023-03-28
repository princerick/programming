package LEETCODE;

import java.util.Scanner;

public class MissingElement {

//					print only one missing element	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of elements you want");
		int n = sc.nextInt();
		int size = n + 1;
		int [] a = new int [n];
		System.out.println("Enter your elements");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		System.out.println(missingElement(a, size));
	} 
	public static int missingElement(int[] a, int size) 
	{
		int arrSum = 0;
		for (int i = 0; i < a.length; i++) 
		{
			arrSum += a[i];
		}
		int actualSum = size * (size + 1) / 2;
		int ele = actualSum - arrSum;
		return ele;
	}
}
