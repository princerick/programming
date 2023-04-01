package KRISHNA_SUNDEEP;

public class RepeatingElement {

//				find repeating element using one loop
	
	public static void main(String[] args) 
	{
		int [] arr = {1,5,8,10,7,8,1,20,20,30};
		int [] temp = new int [arr.length];
		for (int i = 0; i < temp.length; i++) 
		{
			boolean flag = false;
			for (int j = 0; j < temp.length; j++) 
			{
				if(arr[i] == temp[j])
				{
					flag = true;
					System.out.println(arr[i]+" is duplicate");
					break;
				}
			}
			if(flag == false)
			{
				temp[i] = arr[i];
			}
		}
	}
}
