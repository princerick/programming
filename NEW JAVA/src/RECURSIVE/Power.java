package RECURSIVE;

import java.util.Scanner;

public class Power {
	static int n1=1;
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n =sc.nextInt();
		System.out.println("Enter the power: ");
		int p =sc.nextInt();
		System.out.println(pow(p,n));
	}
	static int pow(int p,int n) {
//		if(p<=0) {
//			return n1;
//		}
//		else {
//			n1*=n;
//			return(pow(p-1,n));
//		}
		
		if(p==0) {
			return 1;
		}
		else {
			return n*(pow(p-1,n));
		}
	}
}
