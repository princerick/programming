package PROGRAMING_TUTORIAL;

import java.util.Arrays;

public class Find_Dup_Differ_Ways {

	
	public static void main(String[] args) 
	{
	      int[] a= {1,3,3,2,2,3};
	    
	   //Basic Approach   
//	      for(int i=0;i<a.length;i++) {
//	    	  for(int j=i+1;j<a.length;j++) {
//	    		  if(a[i]==a[j]) {
//	    			  System.out.println(a[i]);
//	    			  break;
//	    		  }
//	    	  }
//	      }
	      
	      System.out.println(findDuplUsingSorting(a));
//	      System.out.println(findDup(a));
		}
		
		
		//simple approach 
		//this will not work for all cases
		public static int findDuplUsingSorting(int []a) 
		{
			Arrays.sort(a);			
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]==a[i+1]) 
				{
					return a[i];
				}
			}
			return -1;
		}
				
//							another approach
//						this will not work for all cases
		
//		public static int findDup(int[]a) 
//		{
//			//Traverse an array
//			for(int i=0;i<a.length;i++) 
//			{				
//				//return the absolute value
//				int index=Math.abs(a[i]);
//				
//				/*If the number present in this index is -ve,
//				 * It means we have found the duplicate.
//				 */
//				
//				if(a[index]<0) {
//					return index;
//				}else {
//					//put a -ve number
//					a[index]= -a[index];
//				}
//			}
//			return -1;
//		}
}
