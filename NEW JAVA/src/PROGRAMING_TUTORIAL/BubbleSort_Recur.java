package PROGRAMING_TUTORIAL;

import java.util.Arrays;

public class BubbleSort_Recur {

	
	public static void main(String[] args) 
	{
	      int[]a= {6,4,1,2,2,3,5,3};
	      sortRecur(a,a.length);
	     System.out.println(Arrays.toString(a));
	}
	   public static void sortRecur(int[]a,int n) 
	   {
		   if(n==1) 
		   {
			   return;
		   }
		   for(int i=0;i<n-1;i++)
		   {
			   if(a[i]>a[i+1]) 
			   {
				   int temp=a[i];
				   a[i]=a[i+1];
				   a[i+1]=temp;
			   }
		   }
		   sortRecur(a,n-1);
	   }
}
