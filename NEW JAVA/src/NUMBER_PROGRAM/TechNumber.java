package NUMBER_PROGRAM;

import java.util.Scanner;

public class TechNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int copy=n;
		int count=0;
		while(n>0) {
			n/=10;
			count++;
			}
			if(count%2==0) {
				count/=2;
				int pow=1;
				for(int i=1;i<=count;i++) {
					pow*=10;
				}
				int n1=copy%pow;
				int n2=copy/pow;
				int sum=n1+n2;
				int sq=sum*sum;
				if(sq==copy) {
					System.out.println("It's a Tech number");
				}
				else {
					System.out.println("It's not a Tech number");
				}
			}
			else {
			 	System.out.println("It's not a Tech number");
			}
		}
	}

