package ARRAY;

import java.util.Scanner;

public class Qube {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int[size];
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		System.out.println("Qube of the array elements are: ");
		for(int i = 0 ; i < size ; i++) {
			int qube = 1;
			 int n = a[i];
			 qube = n * n * n;
			 a[i] = qube;
			 System.out.println(a[i]);
		}
	}
}
