package ARRAY;

import java.util.Scanner;

public class Merge {
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
		int j = 0;
		for(int i = 0 ; i < c.length ; i++) {
			if(i < a.length) {
				c[i] = a[i];
			}
			
			else {
					c[i] = b[j++];
			}
		}
		System.out.println("Merged array elements are");
		for(int i = 0 ; i < c.length ; i++) {
			System.out.println(c[i]);
		}
	}
}
