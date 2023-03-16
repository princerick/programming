package COLLECTION;

import java.util.LinkedList;

public class LinkedMarks 
{

//						add marks of 10 students	
	
	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.add(90);
		l1.add(91);
		l1.add(92);
		l1.add(93);
		l1.add(94);
		l1.add(95);
		l1.add(96);
		l1.add(97);
		l1.add(98);
		l1.add(99);
		System.out.println(l1);
		l1.addFirst(100);
		l1.addLast(200);
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
	}
}
