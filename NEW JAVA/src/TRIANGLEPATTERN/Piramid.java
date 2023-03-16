package TRIANGLEPATTERN;

import java.util.Scanner;

public class Piramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size ");
		int n=sc.nextInt();
		System.out.println("Enetr the number of rows");
		int r=sc.nextInt();
		System.out.println("Enetr the number of columns");	
		int c=sc.nextInt();
		
//								piramid...
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//							reverse piramid...
		
		System.out.println();
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//						  		diamond...
	
		System.out.println();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  "); 
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
