package METHOD;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		
		fibonacci(n);
	}
	public static void fibonacci(int n) {
		int f1=0;
		int f2=1;
		int f3=0;
		for(int i=1;i<=n;i++) {
			System.out.println(f1);
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
	}
}
