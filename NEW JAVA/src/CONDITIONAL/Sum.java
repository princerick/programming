package CONDITIONAL;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		//Sum is greater than 50 or lesser than 50
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		System.out.println("Enter the third number");
		int n3=sc.nextInt();
		int sum=n1+n2+n3;
		if(sum>50)
		{
			System.out.println("The sum is greater than 50");
		}
		if(sum<50)
		{
			System.out.println("The sum is lesser than 50");
		}
	}
}
