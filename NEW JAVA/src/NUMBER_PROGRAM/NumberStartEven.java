package NUMBER_PROGRAM;

import java.util.Scanner;

public class NumberStartEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		while(n>9) {
			n=n/10;
		}
		if(n%2==0) {
			System.out.println("The number starts with an even number");
		}
		else {
			System.out.println("The number doesn't start with an even number");
		}
	}
}
