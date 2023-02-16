package TRIANGLEPATTERN;

import java.util.Scanner;

public class Star10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number of rows");
		int r=sc.nextInt();
		System.out.println("Enetr the number of columns");	
		int c=sc.nextInt();
		for(int i=r;i>=1;i--) {
//			for(int j=1;j<=c;j++) {
//				if(j<=i) {
//				System.out.print(i+" ");
//			}
//				else {
//					System.out.print(" ");
//				}
//			}
			for(int j=i;j>=1;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
