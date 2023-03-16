package NUMBER_PROGRAM;

import java.util.Iterator;
import java.util.Scanner;

public class Odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int n1=sc.nextInt();
		System.out.println("Enter the ending range");
		int n2=sc.nextInt();
		for (int i = n1; i <=n2; i++) {
			int n=i;
			if(n%2==1) {
				System.out.println(n);
			}
		}
	}
}
