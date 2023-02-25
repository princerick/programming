package ARRAY;

import java.util.Scanner;

public class Max3rd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		int max=a[0];
		int max1=a[0];
		int max2=a[0];
		for(int i = 0 ; i < size ; i++) {
			if(a[i] > max) {
				max2=max1;
				max1=max;
				max=a[i];
			}
		}
		System.out.println(max2+" is the 3rd maximum element");
	}
}
