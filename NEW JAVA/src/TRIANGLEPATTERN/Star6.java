package TRIANGLEPATTERN;

import java.util.Scanner;

public class Star6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//									1st logic...	
		
		System.out.println("Enetr a number ");
		int n=sc.nextInt();
		System.out.println("Enetr the number of rows");
		int r=sc.nextInt();
		System.out.println("Enetr the number of columns");	
		int c=sc.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(j>=i) {
				System.out.print("* ");
			}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
			
//									2nd logic...
			
			System.out.println();
			System.out.println(" 2nd Logic...");
			System.out.println();
			for(int i=5;i>=1;i--) {
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
