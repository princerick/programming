package PROGRAMING_TUTORIAL;

import java.util.HashMap;
import java.util.Map;

public class Print_Unique_Ele {

	
//								Using map
	
		public static void main(String[] args) 
		{
	      int[] a= {1,2,3,1,4,2,3,5,6};
	      System.out.println(singleNonDupUsingMap(a));
		}
		
		public static int singleNonDupUsingMap(int[]a) 
		{
			int res=0;
			Map<Integer,Integer> countMap=new HashMap<>();		
			for(int i=0;i<a.length;i++) 
			{
				countMap.put(a[i],countMap.getOrDefault(a[i], 0)+1);
			}			
			for(Map.Entry<Integer,Integer> entry: countMap.entrySet()) 
			{
				if(entry.getValue()==1) 
				{
					res=entry.getKey();
					break;
				}
			}
			return res;
		}
}
