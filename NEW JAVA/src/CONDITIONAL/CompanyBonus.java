package CONDITIONAL;

import java.util.Scanner;

public class CompanyBonus {
	public static void main(String[] args) {
		
		
//							5% bonus for employee...
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your salary");
		double sal=sc.nextDouble();
		System.out.println("Please enter your year of services");
		double service=sc.nextDouble();
		if(service>5) {
			double bonus=sal*5/100;
			System.out.println("Net bonus is "+bonus);
		}
		else {
			System.out.println("Not eligible for getting bonus");
		}
	}
}
