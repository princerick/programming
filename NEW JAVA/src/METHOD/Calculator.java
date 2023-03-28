package METHOD;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice between add, sub, prod, div, rem, disc");
		String s=sc.nextLine();
		System.out.println("Enter two numbers");
		int n1 = sc.nextInt();		
		int n2 = sc.nextInt();
		switch(s) {
		case "add":
			add(n1,n2);
			break;
		case "sub":
			sub(n1,n2);
			break;
		case "prod":
			prod(n1,n2);
			break;
		case "div":
			div(n1,n2);
			break;
		case "rem":
			rem(n1,n2);
			break;
		case "disc":
			disc(n1,n2);
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
