package ARRAY;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		System.out.println("The prime array elements are:  ");
		for(int i = 0 ; i < size ; i++) {
			boolean flag = true;
			for(int j = 2 ; j < a[i] ; j++) {
				if(a[i] % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println(a[i]);
			}
		}		
	}
}
