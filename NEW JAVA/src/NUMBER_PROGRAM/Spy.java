package NUMBER_PROGRAM;

import java.util.Scanner;

public class Spy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		int prod=1;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			prod=prod*rem;
			n=n/10;
		}
		if(sum==prod) {
			System.out.println("It's a spy number");
		}
		else {
			System.out.println("It's not a spy number");
		}
	}
}
