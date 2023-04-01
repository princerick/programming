package PROGRAMING_TUTORIAL;

import java.util.Arrays;

public class Finding_Triplet_Sum {

	
public static boolean findTriplet(int [] arr ,int sum) 
	{		
		if(arr.length < 3)
		{
			return false;
		}
		
		Arrays.sort(arr);		
		for(int i=0;i<arr.length;i++)
		{
			int start = i+1;
			int end =arr.length-1;			
			while(start < end)
			{
				if(arr[i] + arr[start] + arr[end] == sum) 
				{
					return true;
				}
				else if(arr[i] + arr[start] + arr[end] < sum)
				{
					start++;
				}
				else
				{
					end--;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{	
		int [] arr = {1,4,45,6,10,8};
		int sum=13;		
		boolean result = findTriplet(arr , sum);		
		if(result)
		{
			System.out.println("Exists");
		}
		else
		{
			System.out.println("Not Exits");
		}
	}
}
