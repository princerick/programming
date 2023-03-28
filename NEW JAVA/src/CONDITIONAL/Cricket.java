package CONDITIONAL;
import java.util.Scanner;
public class Cricket {
	public static void main(String[] args) {
		
//							Cricket player's score
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your favoiurite cricket palyer innings runs score");
		int run=sc.nextInt();
		if(run>1 && run<=25)
		{
			System.out.println("Bad Performance");
		}
		else if(run>25 && run<=50)
		{
			System.out.println("Good Performance");
		}
		else if(run>=50 && run<=80)
		{
			System.out.println("Very Good Performance");
		}
		else
		{
			System.out.println("Amazing Performance");
		}
	}
}
