package RECURSIVE;

import java.util.Scanner;

public class P5 {
	
//		count how many numbers are present between 15 and user given number
	
	static int n1=0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		int n =sc.nextInt();
		System.out.println(count(n));
	}
	static int count(int n) {
		if(n<=15) {
			return n1;
		}
		else {
			n1++;
			return(count(n-1));
		}
	}
}
