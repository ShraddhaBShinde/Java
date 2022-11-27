package Collection;

import java.util.*;
public class SinglyLinkedList {
	public void LinkedList()
	{
		LinkedList<String> l=new LinkedList();
		
		l.add("abc");
		l.add("pqr");
		
		System.out.println("List is: "+l);
		
		l.add(1,"xyz");
		System.out.println("List is: "+l);
		
		LinkedList<String> l1=new LinkedList();
		l1.add("hello");
		l1.add("world");
		System.out.println("List is: "+l1);
		
		l.addAll(l1);
		System.out.println(l);
		l.addAll(0,l1);
		System.out.println(l);
		
		System.out.println(l.hashCode());
		System.out.println(l.size());
		System.out.println(l.indexOf("abc"));
		
		System.out.println(l.contains("Abc"));
		
		System.out.println(l.get(1));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.set(2, "lmn");
		System.out.println(l);
		
		l.clear();
		System.out.println(l);
	}
	public static void main(String args[])
	{
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.LinkedList();
	}
}
