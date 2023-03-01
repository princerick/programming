package ARRAY;

import java.util.Scanner;

public class ZigzagMerge {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the first array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		System.out.println("Enter the size of second array");
		int size1=sc.nextInt();
		int [] b = new int [size1];
		System.out.println("Enter the second array elements ");
		for(int j = 0 ; j < size1 ; j++) {
			 b[j] = sc.nextInt();
		}
		int [] c = new int [a.length + b.length];
		int i = 0;
		int j = 0;
		for(int k = 0 ; k < c.length ; k++) 
		{
			if(i < a.length) 
			{
				c[k] = a[i++];
				k++;
			}
			if(j < b.length) 
			{
					
				c[k] = b[j++];
			}
		}
		System.out.println("Merged array elements are");
		for(int k = 0 ; k < c.length ; k++) {
			System.out.print(c[k]+" ");
		}
	}
}
