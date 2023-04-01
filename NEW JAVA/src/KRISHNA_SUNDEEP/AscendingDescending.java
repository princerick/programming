package KRISHNA_SUNDEEP;

import java.util.Arrays;
import java.util.Collections;

public class AscendingDescending {

//		  sort an array elements in ascending and descending order	
	
	public static void main(String[] args) 
	{
		String [] c = {"a", "z", "c", "b"};
 		Arrays.sort(c);
		System.out.println("Ascending order>>>>>>>>");
		System.out.println(Arrays.toString(c));
		Arrays.sort(c, Collections.reverseOrder());
		System.out.println("Descending order>>>>>>>>");
		System.out.println(Arrays.toString(c));
	}
}
