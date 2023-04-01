package PROGRAMING_TUTORIAL;

public class Sub_Arr_Sum_By_Using_Size_Max {

	
	public static int getSum(int arr[],int k) 
	{
		int start=0,sum=0,maxSum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(i>=k -1)
			{
				maxSum=Math.max(sum, maxSum);
				sum = sum - arr[start];
				start++;
			}
	    }
		return maxSum;
	}
	public static void main(String[] args) 
	{
		int [] arr = {2,1,5,1,3,2};
		int k =3;
		int result =getSum(arr,k);
		System.out.println(result);
	}
}
