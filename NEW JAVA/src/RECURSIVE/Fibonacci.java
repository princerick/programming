package RECURSIVE;

import java.util.Scanner;

public class Fibonacci {
	static int f1=0,f2=1,f3=0;
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number: ");
			int n =sc.nextInt();
			fib(n);
		}
		static void fib(int n) {
			if(n>0) {
			System.out.println(f3);
			f3=f1+f2;
			f1=f2;
			f2=f3;
			fib(n-1);
			}
		}
}
