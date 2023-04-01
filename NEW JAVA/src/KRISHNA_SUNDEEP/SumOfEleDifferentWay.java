package KRISHNA_SUNDEEP;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfEleDifferentWay {

//			find the sum of the elements in an array in different way	
	
	public static void main(String[] args) 
	{
		int [] arr = {2,3,4,5,7};
		System.out.println("=====================");
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum); 
		System.out.println("=====================");
		int sum1 = IntStream.of(arr).sum();
		System.out.println(sum1);
	}
}
