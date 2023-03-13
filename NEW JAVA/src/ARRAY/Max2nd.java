package ARRAY;

import java.util.Scanner;

public class Max2nd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		int max=a[0];
		int max1=a[1];
		for(int i = 1 ; i < size ; i++) 
		{
			if(a[i] > max) 
			{
				max1=max;
				max=a[i];
			}
			else if(a[i] > max1)
			{
				max1 = a[i];
			}
		}
		
		System.out.println(max1+" is the 2nd maximum element");
	}
}
