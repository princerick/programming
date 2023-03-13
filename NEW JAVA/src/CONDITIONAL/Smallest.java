package CONDITIONAL;

import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		int result=n1<n2 ? n1 : n2;
		System.out.println(result+" is smallest");
	}
}
