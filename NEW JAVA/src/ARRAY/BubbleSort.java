package ARRAY;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int size=sc.nextInt();
		int [] a=new int[size];
		System.out.println("Enter the array elements... ");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The array elements are... ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" "); 
		}
		for (int i = 0; i < a.length-1; i++)
		{
			for (int j = 0; j < a.length-1-i ; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = 0;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("\nThe sorted array elements are... ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
