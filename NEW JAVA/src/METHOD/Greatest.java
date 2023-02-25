package METHOD;

import java.util.Scanner;

public class Greatest {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		check();
	}
	static void check() {
		System.out.println("Enter the 1st number: ");
		int n1 =sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int n2 =sc.nextInt();
		System.out.println("Enter the 3rd number: ");
		int n3 =sc.nextInt();
		int ans = n1>n2 ? n1 : n2>n3 ? n2 : n3;
		System.out.println(ans+" is greatest among three");
	}
}
