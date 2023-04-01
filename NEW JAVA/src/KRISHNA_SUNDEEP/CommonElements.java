package KRISHNA_SUNDEEP;

public class CommonElements {

//					print the common elements in two array
	
	public static void main(String[] args)
	{
		int [] a = {1,2,3,4,5};
		int [] b = {3,4,5};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i] == b[j])
				{
					System.out.println(a[i]+" is common element");
				}
			}
		}
	}
}
