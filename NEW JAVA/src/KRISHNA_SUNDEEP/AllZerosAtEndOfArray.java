package KRISHNA_SUNDEEP;

import java.util.Arrays;

public class AllZerosAtEndOfArray {

//			  move all the zeros at the end of an array	
	
	public static void main(String[] args) 
	{
		int [] a = {10,0,0,20,40,50,60};
		int [] b = new int [a.length];
		int j = 0;
		for (int i : a) 
		{
			if(i != 0)
			{
				b[j] = i;
				j++;
			}
		}
		for (int i : a) 
		{
			if(i == 0)
			{
				b[j] = i;
				j++;
			}
		}
		System.out.println(Arrays.toString(b));	
	}
}
