package RECURSIVE;

import java.util.Scanner;

public class P3 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number to be sum");
		int n =sc.nextInt();
		System.out.println(sum(n));
	}
	static int sum(int n) {
		if(n<3) {
			return n;
		}
		else {
			return (n+sum(n-1));
		}
	}	
}
