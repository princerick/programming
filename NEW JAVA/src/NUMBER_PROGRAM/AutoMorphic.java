 package NUMBER_PROGRAM;

import java.util.Scanner;

public class AutoMorphic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sq=n*n;
		boolean flag=true;
		while(n>0) {
			if(n%10==sq%10) {
				n=n/10;
				sq=sq/10;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("It's an automorphic");
		}
		else {
			System.out.println("It's not an automorphic");
		}
	}
}
