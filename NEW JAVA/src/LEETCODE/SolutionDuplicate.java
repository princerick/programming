package LEETCODE;

import java.util.Arrays;
import java.util.Iterator;

public class SolutionDuplicate {

/*			Input: nums = [0,0,1,1,1,2,2,3,3,4]
			Output: 5, nums = [0,1,2,3,4]
			Explanation: Your function should return k = 5, with the first 
			five elements of nums being 0, 1, 2, 3, and 4 respectively.
			It does not matter what you leave beyond the returned k 
			(hence they are underscores)  */
	
	  public static void main(String [] args)
	    {
	        int [] nums = {0,0,1,1,1,2,2,3,3,4};
	        int[] num = removeDuplicates(nums);
	        System.out.println(Arrays.toString(num));
	    }
	  
	  public static int [] removeDuplicates(int[] nums)  
	    {
	       int i =0 ;
		for(int j=1; j<nums.length ; j++)
	    {
			if(nums[i] !=nums[j])
	        {
				i++;
	        }
	            nums[i] = nums[j];
	    }
		int size = nums.length - (i+1);
		int [] a = new int [nums.length - size];
		for (int j = 0; j < a.length; j++) 
		{
			a[j] = nums[j];
		}
	    return a;
	    }   
}

