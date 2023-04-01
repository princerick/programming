package KRISHNA_SUNDEEP;

import java.util.Arrays;

public class CopyAnArray {

//				copy an array to another array using in-built
	
	public static void main(String[] args) 
	{
		int [] Old = {1,2,3,4};
		int [] New = Arrays.copyOf(Old, Old.length);
		System.out.println(Arrays.toString(New));
	}
}
