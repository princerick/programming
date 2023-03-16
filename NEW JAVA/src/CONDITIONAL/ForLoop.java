package CONDITIONAL;

import java.util.Iterator;
import java.util.Scanner;

public class ForLoop {
	
//									 15 table...
	
	
//	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			int mul=15*i;
//			System.out.println("15*"+i+"="+mul);
//		}
//	}
	
//							 Print 4 five times...44444
	
	
//	public static void main(String[] args) {
//		int n=4;
//		for(int i=1;i<=5;i++) {
//			System.out.print("4");
//		}
//	}
	
//							 Print numbers from n to 1...
		
	
//	public static void main(String[] args) {
//		int n=10;
//		for(int i=n;i>=1;i--) {
//			System.out.println(i);
//		}
//	}
	
//							 Print even numbers from 20 to 40...
	
	
//	public static void main(String[] args) {
//		for(int i=20;i<=40;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
//	}
	
//								 Print odd numbers from 37 to 50...
	
	
//	public static void main(String[] args) {
//		for(int i=37;i<=50;i++) {
//			if(i%2==1) {
//				System.out.println(i);
//			}
//		}
//	}
	
//								 Factorial of a given number...
	
	
//	public static void main(String[] args) {
//		int n=5;
//		int fact=1;
//		for(int i=n;i>=1;i--)
//		{
//			fact=fact*i;
//		}
//		System.out.println(fact);
//	}
	
//							 Find the average of numbers from 10 to 20...
	
	
//	public static void main(String[] args) {
//		int sum=0;
//		int count=0;
//		for(int i=10;i<=20;i++) {
//			sum=sum+i;
//			count++;
//		}
//		System.out.println(sum/count);
//	}
	

//									Fibonacci series....
	
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//		int f1=0;
//		int f2=1;
//		int f3=0; 
//		for(int i=1;i<=n;i++) {
//			System.out.println(f1);
//			f3=f1+f2;
//			f1=f2;
//			f2=f3;
//		}
//	}
	
	
//							nth term of fibonacci series....
	
	
//		public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//		int f1=0;
//		int f2=1;
//		int f3=0;
//		for(int i=1;i<=n;i++) {
//			if(i==n) {
//				System.out.println(f1);
//			}
//		f3=f1+f2;
//		f1=f2;
//		f2=f3;
//		}
//	}

//								Reverse of a number....
	
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//		int rev=0;
//		while(n!=0) {
//			int rem=n%10;
//			rev=rev*10+rem;
//			n=n/10;
//		}
//		System.out.println("reverse is "+rev);
//	}
	
//  						Palindrome number....
	
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//		int copy=n;
//		int rev=0;
//		while(n!=0) {
//			int rem=n%10;
//			rev=rev*10+rem;
//			n=n/10;
//		}
//		if(copy==rev) {
//			System.out.println("yea....It's a palindrome number");
//		}
//		else {
//			System.out.println("No....It's not a palindrome number");
//		}
//	}
	
	
//						number starts with an even number or not
	
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//		int rev=0;
//		while(n!=0) {
//			int rem=n%10;
//			rev=rev*10+rem;
//			n=n/10;
//		}
//		if(rev%2==0) {
//			System.out.println("The number starts with an even number");
//		}
//		else {
//			System.out.println("The number doesn't start with an even number");
//		}
//	}
	
	
//							count the factors of a number	
	
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//		int count=0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		System.out.println("Numbers of factors are "+count);
//	}
	
	
//							factorial of numbers in range	
	
	
//	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			int fact=1;
//			int n=i;
//			for (int j = n; j >=1; j--) {
//				fact=fact*j;
//			}
//			System.out.println("Factorial of "+n+" is "+fact);
//		}
//	}
	
	
//					check a number is composite or not...
	
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//		boolean flag=true;
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//				flag=false;
//			}
//		}
//		if(flag==false) {
//			System.out.println(n+" is a composite number ");
//		}
//		else {
//			System.out.println(n+" is not a composite number ");
//		}
//	}
}
