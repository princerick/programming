package KRISHNA_SUNDEEP;

import java.util.Arrays;

public class SquareInSortedManner {

//		  square of positive and negative number in sorted manner	
	
	public static void main(String[] args) 
	{
		int [] arr = {-6,-1,2,4,5};
		int startindex = 0;
		int endindex = arr.length-1;
		int [] res = new int [arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			int s = arr[startindex];
			int e = arr[endindex];
			if(s*s > e*e)
			{
				res[endindex] = s*s;
				arr [startindex] = e;
			}
			else
			{
				res[endindex] = e*e;
			}
			endindex--;
		}
		System.out.println(Arrays.toString(res));
	}
}
