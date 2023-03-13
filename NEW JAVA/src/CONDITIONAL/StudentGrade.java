package CONDITIONAL;
import java.util.Scanner;
public class StudentGrade {
	public static void main(String[] args) {
		
		//Printing student grade
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your percentage");
		int perc=sc.nextInt();
		if(perc>=85)
		{
			System.out.println("Student has secured with Distibction");
		}
		else if(perc>=35)
		{
			System.out.println("Student has secured with First class");
		}
		else
		{
			System.out.println("Student is Failed");
		}
	}
}
