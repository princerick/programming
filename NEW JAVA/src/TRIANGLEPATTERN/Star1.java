package TRIANGLEPATTERN;

import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a number");
		int n=sc.nextInt();
		System.out.println("Enetr the number of rows");
		int r=sc.nextInt();
		System.out.println("Enetr the number of columns");	
		int c=sc.nextInt();
		for(int i=1;i<=n;i++) {
//			for(int j=c;j>=1;j--) {
//				if(j<=i) {
//				System.out.print("* ");
//			}
//				else{
//					System.out.print("  ");
//				}
//			}
			for(int s=1;s<=n-i;s++) {
				System.out.print("  ");
			}
			for(int star=1;star<=i;star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
