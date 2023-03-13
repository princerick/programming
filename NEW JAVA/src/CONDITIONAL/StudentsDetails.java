package CONDITIONAL;

import java.util.Scanner;

public class StudentsDetails {
	public static void main(String[] args) {
		
		//Student details...
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your roll");
		int roll=sc.nextInt();
		System.out.println("Enter your marks on Math");
		int m1=sc.nextInt();
		System.out.println("Enter your marks on Physic");
		int m2=sc.nextInt();
		System.out.println("Enter your marks on Chemistry");
		int m3=sc.nextInt();
		System.out.println("Enter your marks on English");
		int m4=sc.nextInt();
		System.out.println("Enter your marks on Java");
		int m5=sc.nextInt();
		System.out.println();
		System.out.println("*********************************");
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		double percentage= ((m1+m2+m3+m4+m5)*100)/500;  
		System.out.println("Percentage: "+percentage+"%");
		if(percentage>=90) 
		{
			System.out.println("Grade: A");
		}
		else if(percentage>=80) 
		{
			System.out.println("Grade: B");
		}
		else if(percentage>=70)
		{
			System.out.println("Grade: C");
		}
		else{
			{
				System.out.println("Fail");
			}
		}
	}
}
