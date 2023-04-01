package KRISHNA_SUNDEEP;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {

//						sub array with given sum
	
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,7,5}; 
		int n = 5, s = 12;
		System.out.println(subarraySum(arr,n,s));
	}
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
	 ArrayList l1 = new ArrayList();
	 boolean flag = false;
	        for(int i = 0; i < n; i++)
	        {
	            int sum = arr[i];
	            if(sum == s)
	            {
	            	flag = true;
                    l1.add(i+1);
                    l1.add(i+1);
                    break;
	            }
	            else
	            {
	            	 for(int j = i + 1; j < n; j++)  
			            {
			                sum += arr[j];
			                if(sum == s)
			                {
			                	flag = true;
			                    l1.add(i+1);
			                    l1.add(j+1);
			                    break;
			                }
			            }
			            if(flag == true)
			            {
			            	break;
			            }
	            } 
	        }
	        if(flag == false)
	        {
	        	l1.add(-1);
	        }
		return l1;  
    }
}
