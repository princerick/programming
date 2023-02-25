package ARRAY;

import java.util.Scanner;

public class SelectionSort {
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
		
		for (int i = 0 ; i < size ; i++)
		{
			int min = i;
			for (int j = i + 1 ; j < size ; j++)
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		System.out.println("\nThe sorted array elements are... ");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
