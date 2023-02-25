package LETTER;

import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size ");
		int n=sc.nextInt();
		
		
//										  R		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==1 && j<=n/2+1) || j==1 || (i==n/2+1 && j<=n/2+1) || (j==n/2+1 && i<=n/2+1) || i==n/2+j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");
		
//											I
											
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==(n+1)/2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");
		
		
//											 C
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-1;j++) {
				if(i==1 || i==n || j==1 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");
		
		
//											  K
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n/2+1;j++) {
				if(j==0 || i==n/2-j || i==n/2+j ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
