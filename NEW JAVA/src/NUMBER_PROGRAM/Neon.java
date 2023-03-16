package NUMBER_PROGRAM;

import java.util.Scanner;

public class Neon {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers");
		int n=sc.nextInt();
				int sq=n*n;
				int sum=0;
				while(sq>0) {
					int rem=sq%10;
					sum=sum+rem;
					sq=sq/10;
				}
				if(sum==n) {
					System.out.println(n+" is a neon number");
				}
	}
}
