package ARRAY;

import java.util.Scanner;

public class Min {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		int min=a[0];
		for(int i = 0 ; i < size ; i++) {    
			if(a[i] < min) {
				min=a[i];
			}
		}
		System.out.println(min+" is smaller");
	}
}
