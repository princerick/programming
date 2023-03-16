package NUMBER_PROGRAM;

import java.util.Scanner;

public class XylemPhloem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
//		int copy=n;
//		int Osum=0;
//		int Isum=0;
//		while(n>0) {
//			if(n==copy || n<=9) {
//				Osum+=n%10;
//			}
//			else {
//				Isum+=n%10;
//			}
//			n=n/10;
//		}
//		if(Osum==Isum) {
//			System.out.println("It's a Xylem number");
//		}
//		else {
//			System.out.println("It's not a Xylem number");
//		}
		
//										2nd logic...		
		
		int Isum=0;		
		int Osum=n%10;
		n/=10;
		while(n>9) {
			Isum+=n%10;
			n/=10;
		}
		Osum+=n;
		if(Osum==Isum) {
			System.out.println("It's a Xylem number");
		}
		else {
			System.out.println("It's not a Xylem number");
		}
	}
}
