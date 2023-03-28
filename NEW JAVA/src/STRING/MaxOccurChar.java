package STRING;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccurChar {
	
//				print the maximum times occurred char in a string
	
	public static void main(String[] args) 
	{
		String s = "God bless spiderman";
		char [] c = s.toCharArray();
		int maxval = 0;
		char maxkey = ' ';
		Map <Character , Integer> map = new LinkedHashMap <>();
		for (int i = 0; i < c.length; i++) 
		{
			if(map.containsKey(c[i]) == false)
			{
				map.put(c[i], 1);
			}
			else
			{
				int oldval = map.get(c[i]);
				int newval = oldval + 1;
				map.put(c[i], newval);
			}
		}
		Set <Map.Entry <Character , Integer>> lhmap = map.entrySet();
		for(Map.Entry <Character , Integer> e : lhmap)
		{
			if(e.getValue() > maxval)
			{
				maxval = e.getValue();
				maxkey = e.getKey();
			}
		}
		System.out.print(maxkey+" ");
		System.out.print(maxval);
	}
}
