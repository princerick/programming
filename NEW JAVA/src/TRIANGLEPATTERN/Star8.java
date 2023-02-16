package TRIANGLEPATTERN;

import java.util.Scanner;

public class Star8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number of rows");
		int r=sc.nextInt();
		System.out.println("Enetr the number of columns");	
		int c=sc.nextInt();
		for(int i=1;i<=r;i++) {
//			for(int j=1;j<=c;j++) {
//				if(j<=i) {
//				System.out.print(j+" ");
//			}
//				else {
//					System.out.print(" ");
//				}
//			}
			for(int j=i;j<=c;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
