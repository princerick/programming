package STRING;

import java.util.Scanner;

public class EmailValidationUsingSplit {

//				email validation using split method
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Email Id");
		String s = sc.nextLine();
		if(s != null)
		{
			if(s.startsWith("@") == false)
			{
			if(s.contains("@"))
			{
				String [] s1 = s.split("@");
				boolean flag = false;
				for (int i = 0; i < s1.length; i++) 
				{
					if(s1[i] == "")
					{
						System.out.println("Enter a valid Email Id");
						break;
					}
					else if(s1[i] != null)
						{
							if(s1[i].contains(".") && s1[i].startsWith(".") == false && s1[i].endsWith(".") == false && s1[i].contains("..") == false)
							{
								flag = true;
							}
						}
				}
				if(flag == true)
				{
					System.out.println("Valid Email Id");
				}
				else
				{
					System.out.println("Enter a valid Email Id");
				}
			}
			else
			{
				System.out.println("Enter a valid Email Id");
			}
		}
		else
		{
			System.out.println("Enter a valid Email Id");
		}
	}
	else
	{
		System.out.println("Enter a valid Email Id");
	}
	}
}
