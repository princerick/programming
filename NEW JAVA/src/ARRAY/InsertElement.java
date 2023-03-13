package ARRAY;

import java.util.Scanner;

public class InsertElement {
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
		for (int i = 0; i < size
				
				 ; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter the updating element ");
		int ele=sc.nextInt();
		int [] b = new int[size+1];
		int i = 0;
		for(int j = 0 ; j < size ; j++)
		{
			if(i == 1)
			{
				b[i] = ele;
				i++;
			}
			b[i] = a[j];
			i++;
		}
		System.out.println("\nUpdated array elements are... ");
		for ( i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}
	}
}
