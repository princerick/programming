package NUMBER_PROGRAM;

public class Buzz_Number {

/*			if the number is completely divisble by 7 or if the remainder 
 				is 7 while dividing by 10, is called as buzz number	*/
	
	public static void main(String[] args) 
	{
		int n = 37;
		if(n % 7 == 0 || n % 10 == 7)
		{
			System.out.println("It's a Buzz Number");
		}
		else
		{
			System.out.println("It's not a Buzz Number");
		}
	}
}
