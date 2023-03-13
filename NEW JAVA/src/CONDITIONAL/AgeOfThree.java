package CONDITIONAL;

import java.util.Scanner;

public class AgeOfThree {
	public static void main(String[] args) {
		
		
//								oldest and youngest...
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of Person 1...");
		int p1=sc.nextInt();
		System.out.println("Enter the age of Person 2...");
		int p2=sc.nextInt();
		System.out.println("Enter the age of Person 3...");
		int p3=sc.nextInt();
		if(p1>p2 && p1>p3) {
			System.out.println("Person 1 is oldest");
		}
		else if(p2>p1 && p2>p3) {
			System.out.println("Person 2 is oldest");
		}
		else {
			System.out.println("Person 3 is oldest");
		}
		if(p1<p2 && p1<p3) {
			System.out.println("Person 1 is youngest");
		}
		else if(p2<p1 && p2<p3) {
			System.out.println("Person 2 is youngest");
		}
		else {
			System.out.println("Person 3 is youngest");
		}
	}
}
