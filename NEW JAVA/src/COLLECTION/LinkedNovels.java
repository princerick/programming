package COLLECTION;

import java.util.LinkedList;

public class LinkedNovels {

//						add 5 novels name to another linkedlist	
	
	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.add("Pire-Kamil");
		l1.add("Angan");
		l1.add("Aag Ka Dariya");
		l1.add("Umrao Jaan");
		l1.add("Gitanjali");
		LinkedList l2 = new LinkedList();
		l2.addAll(l1);
		System.out.println(l2);
	}
}
