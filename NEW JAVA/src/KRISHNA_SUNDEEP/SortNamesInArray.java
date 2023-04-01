package KRISHNA_SUNDEEP;

import java.util.Arrays;

public class SortNamesInArray {

//						sort names in an array
	
	public static void main(String[] args) 
	{
		String [] str = {"Banana","Grapes","Apple"};
		String temp = "";
		for (int i = 0; i < str.length; i++) 
		{
			for (int j = i+1; j < str.length; j++) 
			{
				if(str[i].compareTo(str[j]) > 0)
				{
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}	
			}
		}
		System.out.println(Arrays.toString(str));
	}
}
