package LEETCODE;

public class Solution {

/*      Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
		You may assume that each input would have exactly one solution, and you may not use the same element twice.
		EXAMPLE: 
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
	
	 public static void main(String [] args)
	    {
	        int [] nums = {2,7,11,15};
	        int target = 9;
	        int [] n = twoSum(nums, target);
	         for(int i = 0; i < n.length; i++)
	        {
	            System.out.print(n[i]+" ");
	        }
	    }
	    public static int[] twoSum(int[] nums, int target) 
	    {
	         int [] a = new int [2];
	        for(int i = 0; i < nums.length; i++)
	        {
	            for(int j = i + 1 ; j< nums.length ; j++)
	            {
	                if(nums[i] + nums[j] == target)
	                {  
	                     for(int k = 0; k < a.length; k++)
	                     {
	                         a[k] = i;
	                         i = j;
	                     }
	                     break;
	                }    
	            }
	        }   
	        return (a);    
	    }
}
