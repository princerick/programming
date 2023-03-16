package NUMBER_PROGRAM;

public class Duck_Number {

/*							duck number or not
			if a number contains atleast one 0 excluding it's first position  */	
	
	public static void main(String[] args) 
	{
		int n = 145;
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
