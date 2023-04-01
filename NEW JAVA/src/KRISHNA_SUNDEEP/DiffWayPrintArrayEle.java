package KRISHNA_SUNDEEP;

import java.util.Arrays;

public class DiffWayPrintArrayEle {

//				 different way to print the array elements
	
	public static void main(String[] args) 
	{
		String [] s = {"black", "blue", "red"};
		int [] [] a = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Using clasic for loop>>>>>>>>>");
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}
		System.out.println("Using enhanced for loop>>>>>>>>>");
		for(String str : s)
		{
			System.out.println(str);
		}
		System.out.println("Using Arrays.asList method>>>>>>>>>");
		System.out.println(Arrays.asList(s));
		System.out.println("Using Arrays.toString method>>>>>>>>>");
		System.out.println(Arrays.toString(s));
		System.out.println("Using Arrays.deepToString method>>>>>>>>>");
		System.out.println(Arrays.deepToString(s));
		System.out.println(Arrays.deepToString(a));
	} 
}
