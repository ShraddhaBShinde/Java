package Strings;   //(Non-primitive datatype)->Strings->group of characters

public class StringDemo {
	public static void main(String args[])
	{
		String str="I Am leArning stringS"; //string literal
		String s=new String("object -> I am the object.");
		String s2=new String("object -> I Am the object.");
		
		System.out.println(str);
		System.out.println(str.toUpperCase());  //changes the string temporarily
		System.out.println(str.toLowerCase());  //changes the string temporarily
		System.out.println(str); //output shows that strings are immutable
		System.out.println(str.length());  //starts from 0
		
		System.out.println();
		System.out.println(s);
		System.out.println(s.toUpperCase());  //changes the string temporarily
		System.out.println(s.toLowerCase());  //changes the string temporarily
		System.out.println(s); //output shows that strings are immutable
		System.out.println(s.length());  //starts from 0
		
		System.out.println();
		System.out.println("First occurence of 't' is: "+s.indexOf('t'));
		System.out.println("Last occurence of 't' is: "+s.lastIndexOf('t'));
		System.out.println("First occurence of 'object' is: "+s.indexOf("object"));
		System.out.println("Last occurence of 'object' is: "+s.lastIndexOf("object"));
		
		System.out.println();
		System.out.println(s.charAt(7));
		
		System.out.println();
		System.out.println(s.replace('a', 'A'));
		System.out.println(s.replace("object", "hello"));
		
		System.out.println();
		System.out.println(s.substring(2)); //cropping the string
		System.out.println(s.substring(7, 13));
		
		System.out.println();
		System.out.println(str.concat(" in Core Java."));
		System.out.println(str.contains("Core"));
		
		System.out.println();
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));		
	}
}
