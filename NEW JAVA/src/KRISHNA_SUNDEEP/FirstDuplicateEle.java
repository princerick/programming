package KRISHNA_SUNDEEP;

public class FirstDuplicateEle {

//		find the first duplicate occurrence	of a number in an array
	
	public static void main(String[] args) 
	{
		Integer [] a = {1,2,3,4,10,2,7,3};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i] == a[j])
				{
					System.out.println(a[i]+" is first duplicate occurrence");
					System.exit(0);
				}
			}
		}
	}
}
