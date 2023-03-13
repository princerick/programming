package STRING;

import java.util.Scanner;

public class Mobile 
{

/*			print user entered mobile number as first 4 digit will be number 
			and remaining digits will be in astrix i.g. (7760******)*/
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile number");
		String s = sc.next();
		System.out.print(s.substring(0,4).concat("******"));
		System.out.println("================");
		System.out.print(s.substring(0,4)+"******");
	}
}
