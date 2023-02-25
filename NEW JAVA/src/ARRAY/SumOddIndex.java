package ARRAY;

import java.util.Scanner;

public class SumOddIndex {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0 ; i < size ; i++) {
			if(i % 2 == 1) {
				sum += a[i];
			}
		}
		System.out.println("Sum is "+sum);
	}
}
