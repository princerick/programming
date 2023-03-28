package NUMBER_PROGRAM;

import java.util.Scanner;

public class Duck_Number {

/*							duck number or not
			if a number contains at least one 0 excluding it's first position  */	
	
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean flag = false;
		while(n>9)
		{
			int rem = n % 10;
			if(rem == 0)
			{
				flag = true;
				break;
			}
			n /= 10;
		}
		if(flag == true)
		{
			System.out.println("It's a duck");
		}
		else
			System.out.println("Not duck");
	}
}
