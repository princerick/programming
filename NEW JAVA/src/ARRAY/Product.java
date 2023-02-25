package ARRAY;

import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int[size];
		int prod=1;
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < size ; i++) {
			 prod = prod * a [i];
		}
		System.out.println("products of the array elements are: "+prod);
	}
}
