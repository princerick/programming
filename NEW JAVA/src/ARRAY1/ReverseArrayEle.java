package ARRAY1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayEle {

//					reverse array elements using collection
	
	public static void main(String[] args) 
	{
		Integer [] a = {1,2,3,4,5};
		List l1 = Arrays.asList(a);
//		System.out.println("1=======================");
//		Arrays.sort(a, Collections.reverseOrder());
//		System.out.println(Arrays.toString(a));
		System.out.println("2=======================");
		Collections.reverse(l1);
		System.out.println(l1);
	}
}
