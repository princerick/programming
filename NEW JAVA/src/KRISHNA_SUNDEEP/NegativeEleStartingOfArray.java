package KRISHNA_SUNDEEP;

import java.util.Arrays;

public class NegativeEleStartingOfArray {

//		move all the negative elements at the starting of an array
	
	public static void main(String[] args) 
	{
		int [] a = {-1,-20,30,40,50,-8};
		int [] b = new int [a.length];
		int j = 0;
		for (int i : a) 
		{
			if(i < 0)
			{
				b[j] = i;
				j++;
			}
		}
		for (int i : a) 
		{
			if(i > 0)
			{
				b[j] = i;
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
