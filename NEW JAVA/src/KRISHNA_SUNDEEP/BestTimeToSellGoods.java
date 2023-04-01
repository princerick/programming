package KRISHNA_SUNDEEP;

import java.util.Arrays;

public class BestTimeToSellGoods {

//			find the best time to sell the goods (max profit) 	
	
	public static void main(String[] args) 
	{
		int [] arr = {10,20,3,40,80,90};
		Arrays.sort(arr);
		System.out.println("Best time to sell is "+(arr[arr.length-1] - arr[0]));
	}
}
