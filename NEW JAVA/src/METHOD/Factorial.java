package METHOD;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		
		System.out.println(factorial(n));
	
	}
	
	public static long factorial(int n) {
		
		int fact=1;
		
		for(int i=n;i>=1;i--)
		{
		
			fact=fact*i;
		
		}
		return(fact);
	}
}
