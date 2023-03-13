package CONDITIONAL;
import java.util.Scanner;
public class Vote {
	public static void main(String[] args) {
		
		//Eligible to vote or not
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible to  vote");
		}
		else
		{
			System.out.println("Not eligible");
		}
	}
}
