package CONDITIONAL;
import java.util.Scanner;
public class Multiple {
	public static void main(String[] args) {
		
		//Given number is multiple of 8
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%8==0)
		{
			System.out.println(n+" is multiple of 8");
		}
		else
		{
			System.out.println(n+" is not multiple of 8");
		}
	}
}
