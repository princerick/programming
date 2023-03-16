package NUMBER_PROGRAM;

import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a number ");
		int n=sc.nextInt();
		int sum=n+1;
		boolean flag=true;
		for(int i=1;i<=n/2;i++) {
			if(i*i==sum) {
			flag=false;
			break;
			}
		}
		if(flag==false) {
			System.out.println("It's a Sunny number...");
		}
		else {
			System.out.println("It's not a Sunny number...");
		}
	}
}
