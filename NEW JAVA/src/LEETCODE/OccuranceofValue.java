package LEETCODE;

import java.util.Arrays;

public class OccuranceofValue {

/*			Input: nums = [3,2,2,3], val = 3
			Output: 2, nums = [2,2,,]
			Explanation: Your function should return k = 2, with 
			the first two elements of nums being 2.
			It does not matter what you leave beyond the
			returned k (hence they are underscores)  */			
	
	 public static void main(String [] args)
	    {
	        int [] nums = {3,2,2,3};
	        int val = 3;
	        int[] a = removeValue(val, nums);
	        System.out.println(Arrays.toString(a));
	    }

	 public static int[] removeValue(int val, int[] nums) 
	 {
		 int count = 0;
		for (int i = 0; i < nums.length; i++) 
		{
			if(nums[i] == val)
			{
				count++;
			}
		}
		int [] a = new int [nums.length - count];
		int j = 0; 
		for (int i = 0; i < nums.length; i++) 
		{
			if(nums[i] != val)
			{
				a[j] = nums[i];
				j++;
			}
		}
		return a;
	 }
}
