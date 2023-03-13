package CONDITIONAL;

import java.util.Scanner;

public class AgeSexMarital {
	public static void main(String[] args) {
		
		
//				work based on age, sex and marital status...
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age...");
		int age=sc.nextInt();
		if(age>=20 && age<=60) {
		System.out.println("Enter your sex (M or F)");
		char ch=sc.next().charAt(0);
		System.out.println("Enter your marital status (Y or N)");
		char ch1=sc.next().charAt(0);
		if(ch=='F') {
			System.out.println("Employee will work only in urban areas");
		}
		else if(ch=='M' && age>=20 && age<=40) {
			System.out.println("Employee may work in any location");
		}
		else if(ch=='M' && age>40 && age<=60) {
			System.out.println("Employee will work only in urban areas");
		}
	}
		else {
			System.out.println("ERROR");
		}
}
}
