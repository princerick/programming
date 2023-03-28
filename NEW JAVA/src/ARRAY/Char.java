package ARRAY;

import java.util.Scanner;

public class Char {
	
//					print 1st and 2nd char of a char array
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		char [] a = new char[size];
		System.out.println("Enter the array characters ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.next().charAt(0);
		}
		for(int i = 0 ; i < size ; i++) {
		}
		 System.out.println("First Character: "+a[0]);
		 System.out.println("Last Character: "+a[a.length-1]);
	}
}
