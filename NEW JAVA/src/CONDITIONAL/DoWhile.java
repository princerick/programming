     package CONDITIONAL;

import java.util.Scanner;

public class DoWhile 
{
	
//									Table of 5...
	
	
//	public static void main(String[] args) {
//		int i=1;
//		do {
//			int mul=5*i;
//			System.out.println("5*"+i+"="+mul);
//			i++;
//		}while(i<=10);
//	}
	
//							 Sum of First 10 even numbers...
	
	
//	public static void main(String[] args) {
//		int i=1;
//		int count=0;
//		int sum=0;
//		do {
//			if(i%2==0) {
//			sum=sum+i;
//			count++;
//			}
//			i++;
//		}while(count<10);
//		System.out.println("Sum of first 10 even numbers is "+sum);
//	}
	
//							 Ascci values of a to z...
	
	
	public static void main(String[] args) {
		char ch='a';
		do {
			System.out.println("a=> "+(int)ch);
			ch++;
		}while(ch<='z');
	}
	
//							Print numbers from 60 to 100...
	
	
//	public static void main(String[] args) {
//		int n=60;
//		do {
//			System.out.println(n);
//			n++;
//		}while(n<=100);
//		}
//	}
	
//							Print numbers from 60 to 100...
	
	
//	public static void main(String[] args) {
//		int n=500;
//		do {
//			System.out.println(n);
//			n--;
//		}while(n>=400);
//		}
//	}
	
//							Product of even numbers only...
	
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the initial range...");
//		int n1=sc.nextInt();
//		System.out.println("Enter the ending range...");
//		int n2=sc.nextInt();
//		int prod=1;
//		for(int i=n1;i<=n2;i++) {
//			if(i%2==0) {
//				prod=prod*i;
//			}
//		}
//		System.out.println(prod);
//	}
	
//                  		Product of positive numbers only...
	
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter two positive numbers...");
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		if(n1>0 && n2>0) {
//			int prod=n1*n2;
//			System.out.println("Product of "+n1+" and "+n2+" is "+prod);
//		}
//		else{
//			System.out.println("enter the positive number only....");
//			if(n1<=0) {
//				System.out.println(n1+" is negative");
//			}
//			else {
//				System.out.println(n2+" is negative");
//			}
//		}
//	}
	
}
