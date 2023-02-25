package RECURSIVE;

import java.util.Scanner;

public class P4 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number to find factorial: ");
		int n =sc.nextInt();
		System.out.println(fact(n));
	}
	static int fact(int n) {
		if(n<=1) {
			return n;
		}
		else {
			return (n*fact(n-1));
		}
	}
}
