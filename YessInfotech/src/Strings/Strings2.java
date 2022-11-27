package Strings;

//String declared using String is stored in string constant pool whereas the int,double etc. are stored in heap memory
//last position is null

public class Strings2 {
	public static void main(String args[])
	{
		String s="Java ";
		String s2="java";
		System.out.println("String s is: "+s);
		String s1=new String("Programming");
		System.out.println("String s1 is: "+s1);
		//.length()
		System.out.println("Length of s is: "+s.length()); //4 (0-4) index 4 is having value null
		//charAt
		System.out.println("Char at index 1 is: "+s.charAt(1));
		//indexOf
		System.out.println("Index of a is: "+s.indexOf('a'));
		//lastIndexOf
		System.out.println("Index of a is: "+s.lastIndexOf('a'));
		//substring
		String str=s.substring(1);
		System.out.println("First substring is: "+str);
		String str1=s1.substring(2,7);
		System.out.println("Second substring is: "+str1);
		//equals
		System.out.println(s.equals(s1)); //false
		System.out.println(s.equals(s2));//false
		System.out.println(s.equalsIgnoreCase(s2)); //true
		//changecase
		System.out.println("To lower case: "+s.toLowerCase());
		System.out.println("To upper case: "+s.toUpperCase());
		//concat
		System.out.println(s.concat(s1));
	}
}
