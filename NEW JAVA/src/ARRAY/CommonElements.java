package ARRAY;

import java.util.Scanner;

public class CommonElements {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of 1st array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the 1st array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		System.out.println("Enter the size of 2nd array");
		int size1=sc.nextInt();
		int [] b = new int [size];
		System.out.println("Enter the 2nd array elements ");
		for(int i = 0 ; i < size1 ; i++) {
			 b[i] = sc.nextInt();
		}
		for(int j = 0 ; j < a.length ; j++)
			for(int i = 0; i < b.length ; i++) {
			if(a[j]==b[i]) {
				System.out.println(a[j]+" is the common element");
			}
		}
		
	}
}
