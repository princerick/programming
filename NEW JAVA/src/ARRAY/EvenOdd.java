package ARRAY;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		System.out.println("Even array elements are: ");
		for(int i = 0 ; i < size ; i++) {
			int n = a[i];
			if(n % 2 == 0) {
				System.out.println(a[i]);
			}
			}
		System.out.println("Odd array elements are: ");
		for(int i = 0 ; i < size ; i++) {
			int n = a[i];
			if(n % 2 == 1) {
				System.out.println(a[i]);
			}
			}
		}		
	}

