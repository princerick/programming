package RECURSIVE;

import java.util.Scanner;

public class P2 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of times to be printed the msg: ");
		int n =sc.nextInt();
		msg(n);
	}
	static void msg(int n) {
		if(n<1) {
			return;
		}
		else {
			System.out.println("Happy Birthday...");
			//n--;
			msg(--n);
		}
	}
}
