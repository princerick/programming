package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class PizzaSet {

	int price;
	String size;
	PizzaSet(int price, String size)
	{
		this.price = price;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "PizzaSet [price=" + price + ", size=" + size + "]";
	}

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(new PizzaSet(100, "S"));
		a1.add(new PizzaSet(600, "M"));
		a1.add(new PizzaSet(500, "L"));
//		for(Object o : a1)
//		{
//			System.out.println(o);
//		}
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
