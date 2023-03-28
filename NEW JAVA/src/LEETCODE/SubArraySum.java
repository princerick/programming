package LEETCODE;

public class SubArraySum 
{
	public static void main(String[] args) 
	{
	int [] nums = {1,-1,0};
	int k = 0;
	System.out.println(subarraySum(nums , k));
	}
	    public static int subarraySum(int[] nums, int k) 
	    {
	        int count = 0;
	        for (int i = 0; i < nums.length; i++) 
	        {
	        	int sum = 0;
		        for(int j = i ; j < nums.length ; j++)
		        {
		                sum = sum + nums[j];
		                if(sum == k)
		                {
		                	count++;
		                }
		        }
			}
	        return count;
	    }
}
