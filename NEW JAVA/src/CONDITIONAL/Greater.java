package CONDITIONAL;

import java.util.Scanner;

public class Greater {
	public static void main(String[] args) {
		
		
//						print greatest among two numbers...
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+" is greatest...");
		}
		else {
			System.out.println(b+" is greatest...");
		}
	}
}
