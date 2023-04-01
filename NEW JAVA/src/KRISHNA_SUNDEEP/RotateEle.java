package KRISHNA_SUNDEEP;

import java.util.Arrays;

public class RotateEle {

	public static void main(String[] args)
	{
		int [] arr = {1,2,3,4,5};
		int n = 5;
		 int [] a = new int [n];
	        a[0] = arr[n-1];
	        int j = 0;
	        for(int i = 1; i < n; i++)
	        {
	            a[i] = arr[j];
	            j++;
	        }
	        System.out.println(Arrays.toString(a));
	}
}
