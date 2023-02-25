package ARRAY;

import java.util.Scanner;

public class Min3rd {
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
			int min1=a[0];
			int min2=a[0];
			for(int i = 0 ; i < size ; i++) {
				if(a[i] < min) {
					min2=min1;
					min1=min;
					min=a[i];
			 }
	}
		System.out.println(min2+" is the 3rd minimum element");
	}
}
