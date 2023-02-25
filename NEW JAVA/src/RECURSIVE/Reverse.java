package RECURSIVE;

import java.util.Scanner;

public class Reverse {
	static 	int rev=0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		int n =sc.nextInt();
		System.out.println(rev(n));
	}
	static int rev(int n) {
		int rem=n%10;
		rev=rev*10+rem;
		n/=10;
		
		if(n<=0) {
			return rev;
		}
		else {
			return(rev(n));
		}
	}
}
