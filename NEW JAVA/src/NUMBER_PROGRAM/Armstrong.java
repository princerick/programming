 package NUMBER_PROGRAM;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int copy=n;
		int temp=n;
		int count=0;
		int sum=0;
		
		while(n>0) {
			count++;
			n=n/10;
		}
		
		while(temp>0) {
			int rem=temp%10;
			int mul=1;
			for(int i=1;i<=count;i++) {
				mul=mul*rem;
			}
			sum=sum+mul;
			temp=temp/10;
		}
		if(copy==sum) {
			System.out.println("It's a armstrong number");
		}
		else {
			System.out.println("It's not a armstrong number");
		}
	}
}
