package Strings;

public class StringBuilderClass {
	public static void main(String args[])
	{
		StringBuilder s=new StringBuilder("I am String Builder Demo");
		System.out.println(s);
		System.out.println(s.append(" appended"));
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.indexOf("String"));
		System.out.println(s.indexOf("B"));
		System.out.println(s.replace(13, 13, "b"));
		System.out.println(s.deleteCharAt(12));
		System.out.println(s.reverse());
	}
}
