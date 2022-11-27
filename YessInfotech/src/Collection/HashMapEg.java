package Collection;

import java.util.*;
public class HashMapEg {
	public void hashmap()
	{
		int a;
		HashMap<Integer,String> m=new HashMap();
		m.put(1,"abc");
		m.put(2,"pqr");
		m.put(3, "xyz");
		System.out.println(m);
		
		HashMap<Integer,String> m2=new HashMap();
		m2.put(1,"hello");
		m2.put(2, "world");
		System.out.println(m2);
		
		m.putAll(m2);
		System.out.println(m);
		m.putIfAbsent(4,"new1");
		System.out.println(m);
		System.out.println(m.containsKey(1));
		System.out.println(m.containsValue("new"));
		System.out.println(m.get(1));
		
		System.out.println(m.hashCode());
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		m.remove(1);
		System.out.println(m);
		
		m.remove(1, "hii");
		System.out.println(m);
		
		m.replace(1, "new");
		m.replace(2, "pqr1", "newValue");
		
		m.clear();
		System.out.println(m);
	}
	
	public static void main(String args[])
	{
		HashMapEg h=new HashMapEg();
		h.hashmap();
	}
}
