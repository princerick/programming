package METHOD;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice between add, sub, prod, div, rem, disc");
		String s=sc.nextLine();
		switch(s) {
		case "add":
			add(5,10);
			break;
		case "sub":
			sub(50,10);
			break;
		case "prod":
			prod(5,10);
			break;
		case "div":
			div(500,10);
			break;
		case "rem":
			rem(56,10);
			break;
		case "disc":
			disc(5000,30);
			break;
		}
	}
	static void add(int a,int b) {
		int add=a+b;
		System.out.println(a+"+"+b+"="+add);
	}
	static void sub(int a,int b) {
		int sub=a-b;
		System.out.println(a+"-"+b+"="+sub);
	}
	static void prod(int a,int b) {
		int prod=a*b;
		System.out.println(a+"*"+b+"="+prod);
	}
	static void div(int a,int b) {
		int div=a/b;
		System.out.println(a+"/"+b+"="+div);
	}
	static void rem(int a,int b) {
		int rem=a%b;
		System.out.println(a+"%"+b+"="+rem);
	}
	static void disc(int a,int b) {
		int disc=a*b/100;
		System.out.println(b+"% Discount of "+a+ " is "+disc);
	}
}
