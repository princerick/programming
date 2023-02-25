package ARRAY;

import java.util.Scanner;

public class Avg {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int[size];
		int sum = 0;
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < size ; i++) {
			 sum = sum + a[i];
		}
		int avg = sum / size;
		System.out.println("Average of the array elements are: "+avg);
	}
}
