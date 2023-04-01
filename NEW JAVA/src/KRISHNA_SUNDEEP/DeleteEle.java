package KRISHNA_SUNDEEP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteEle {

//				delete an element from an array	using collection
	
	public static void main(String[] args) 
	{
		String [] s = {"green", "red", "blue"};
		List l1 = new ArrayList(Arrays.asList(s));
		l1.remove("blue");
		System.out.println(l1);
	}
}
