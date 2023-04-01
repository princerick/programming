package KRISHNA_SUNDEEP;

import java.util.ArrayList;
import java.util.HashSet;

public class FirstRepeatingEle {

//						first repeating element	
	
	public static void main(String[] args) 
	{
		int  [] arr = {1,5,4,5,3,3,5,6};
		HashSet h1 = new HashSet();
		HashSet h2 = new HashSet();
		for(Object o : arr)
		{
			h2.add(o);
		}
		int pos = arr.length;
		int pos1 = arr.length;
		if(h2.size() != arr.length)
		{
			for (int i = arr.length - 1; i >= 0; i--) 
			{
				if(h1.contains(arr[i]))
				{
					pos = i+1;
					if(pos < pos1)
					{
						pos1 = pos;
					}
				}
				else
				{
					h1.add(arr[i]);
				}
			}
		}
		else
		{
			pos1 = -1;
		}
		System.out.println(pos1);
	}
}
