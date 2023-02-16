package TRIANGLEPATTERN;

import java.util.Scanner;

public class Star4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number of rows");
		int r=sc.nextInt();
		System.out.println("Enetr the number of columns");	
		int c=sc.nextInt();
		for(int i=1;i<=r;i++) {
			int a=5;
			for(int j=c;j>=1;j--) {
				if(j<=i) {
				System.out.print(a--+" ");
			}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
