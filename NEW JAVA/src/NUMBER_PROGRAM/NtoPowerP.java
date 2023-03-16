package NUMBER_PROGRAM;

import java.util.Scanner;

public class NtoPowerP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the power");
		int p=sc.nextInt();
		int ans=1;
		for(int i=1;i<=p;i++) {
			ans*=n;
		}
		System.out.println("n to power p = "+ans);
	}
}
