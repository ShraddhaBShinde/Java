package Strings;  //String buffer is mutable i.e it can be changed after initialization (synchronized)

public class StringBufferClass {
	public static void main(String args[])
	{
		StringBuffer s=new StringBuffer("I am immutable string");
		System.out.println(s);
		System.out.println(s.append(" hello")); //string is changed
		System.out.println(s); //shows that the string is mutable
		System.out.println();
		System.out.println(s.reverse());
		System.out.println(s.length());
		System.out.println(s.reverse());
		System.out.println(s.replace(2,7,"byebye"));
		System.out.println(s.insert(7, "i"));
		System.out.println(s.delete(2, 7));
		System.out.println(s.charAt(13));
		System.out.println(s.deleteCharAt(13));
		System.out.println(s.substring(2)); //cropping the string
		System.out.println(s.substring(7, 13));
		
		
	}
}
