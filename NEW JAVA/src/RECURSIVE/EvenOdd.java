package RECURSIVE;

import java.util.Scanner;

public class EvenOdd {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the range: ");
		int n =sc.nextInt();
		evenOdd(n);
	}
	static int evenOdd(int n) {
		
		if(n<=1) {
			return n;
		}
		else {
			if(n%2==0) {
				System.out.println("Even => "+n);
			}
			else {
				System.out.println("Odd => "+n);
			}
			return(evenOdd(n-1));
		}
	}
}
