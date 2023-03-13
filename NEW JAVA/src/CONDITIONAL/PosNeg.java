package CONDITIONAL;

import java.util.Scanner;

public class PosNeg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check wheather it is positive or negative");
		int n=sc.nextInt();
		String result= n>=0 ? "Number is Positive" :"Number is Negative";
		System.out.println(result);
	}
}
