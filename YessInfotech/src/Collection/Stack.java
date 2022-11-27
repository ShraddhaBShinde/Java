package Collection;

import java.util.*;
public class Stack {
	public static void main(String args[])
	{
		Vector <Integer> v=new Vector();
		v.add(10);
		v.add(20);
		System.out.println(v);
		
		v.addElement(30);
		System.out.println(v);
		
		v.remove(1);
		System.out.println(v);
		
		v.removeElement(10);
		System.out.println(v);
		
		System.out.println(v.capacity());
		
		System.out.println(v.size());
		System.out.println(v.elementAt(0));
	}
}
