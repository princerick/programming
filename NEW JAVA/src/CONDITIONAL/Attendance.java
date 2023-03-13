package CONDITIONAL;

import java.util.Scanner;

public class Attendance {
	public static void main(String[] args) {
		
		
//								attendance of the class...	
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of classes held...");
		int cls_held=sc.nextInt();
		System.out.println("Enter the number of classes attended...");
		int cls_atd=sc.nextInt();
		double perc=cls_atd*100/cls_held;
		System.out.println(perc+"% classes attended...");
		if(perc>=75) {
			System.out.println("Student is allowed to sit in exam");
		}
		else {
			System.out.println("Student is not allowed to sit in exam");
		} 
	}
}
