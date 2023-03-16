package NUMBER_PROGRAM;

import java.util.Scanner;

public class Strong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int copy=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			int fact=1;
			for(int i=rem;i>=1;i--) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(copy==sum) {
			System.out.println(copy+" is a strong number");
		}
		else {
			System.out.println(copy+" is not a strong number");
		}
	}
}
