package CONDITIONAL;

import java.util.Scanner;

public class CheckSquare {
	public static void main(String[] args) {
		
		
//						wheather the rectangle is square or not...
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int l=sc.nextInt();
		System.out.println("Enter the breadth");
		int b=sc.nextInt();
		if(l==b) {
			System.out.println("It's a square...");
		}
		else {
			System.out.println("It's not a square...");
		}
	}
}
