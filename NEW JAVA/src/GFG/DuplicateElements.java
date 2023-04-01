package GFG;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateElements {

	public static void main(String[] args) 
	{
		int [] arr = {2,3,1,2,3};
		int n = 5;
		System.out.println(duplicates(arr, n));
	}
		
		
		public static ArrayList<Integer> duplicates(int arr[], int n) {
			Set s1 = new TreeSet();
			ArrayList a1 = new ArrayList();
			Set s3 = new TreeSet();
			Set s2 = new TreeSet();
			for(Integer i : arr)
			{
				s3.add(i);
			}
			for (int i = 0; i < arr.length; i++) 
			{
				if(s3.size() != arr.length)
				{
					if(s1.contains(arr[i]) && !a1.contains(arr[i]))
					{
						a1.add(arr[i]);
					}
					else
					{
						s1.add(arr[i]);
					}
				}
				else
				{
					a1.add(-1);
				}
			}
			return a1;
	    }
}
