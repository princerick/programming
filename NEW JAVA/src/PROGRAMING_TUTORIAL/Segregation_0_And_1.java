package PROGRAMING_TUTORIAL;

import java.util.Arrays;

public class Segregation_0_And_1 {

	
	public static int[] segregation(int a[])
	{
		int left,right;
		left=0;
		right=a.length-1;
		while(left<right)
		{
			while(a[left]%2==0&&left<right)
			{
				left++;
			}
			while(a[right]%2==1&&left<right)
			{
				right--;
			}
			if(left<right) 
			{
				int x=a[left];
				a[left]=a[right];
				a[right]=x;
				left++;
				right--;				
			}
		}
		return a;
	}	
	public static void main(String[] args) 
	{		
        int s[]= {0,1,1,0,1,0,1,1,0};
          segregation(s);
          System.out.println(Arrays.toString(s));
	}
}
