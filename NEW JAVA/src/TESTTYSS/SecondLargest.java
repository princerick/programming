package TESTTYSS;

import java.util.Iterator;

public class SecondLargest {
	public static void main(String[] args) {
		int [] a = {9,5,7,3,1};
		int large1 = a[0];
		int large2 = a[1];
		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] > large1)
			{
				large2 = large1;
				large1 = a[i];
			}
			else if (a[i] > large2)
			{
				large2 = a[i];
			}
		}
		System.out.println(large2+" is the second largest element");
	}
}
