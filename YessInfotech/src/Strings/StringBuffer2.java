package Strings;

//thread safe->one user at a time
//stores 16 char by default
public class StringBuffer2 {
	void string()
	{
		StringBuffer s=new StringBuffer("Java");  //20
		StringBuffer s1=new StringBuffer(); //16
		//print
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println("Length of string s is: "+s.length());
		System.out.println("Capacity of string s is: "+s.capacity());
		System.out.println("Capacity of string s1 is: "+s1.capacity());
		System.out.println("Length of string s is: "+s1.length());
		
		char ch[]= {'a','b','c'};
		s.append(ch);
		System.out.println(s.capacity());
		s.append("Good Evening");
		System.out.println(s);
		System.out.println(s.capacity());
		s.append(12);
		System.out.println(s);
		System.out.println(s.capacity());
		
		System.out.println(s.charAt(2));
		
		s.replace(0, 3, "CPP");
		System.out.println(s);
		
		s.delete(0, 2);
		System.out.println(s);
		
		String s3=s.substring(2);
		String s4=s.substring(2,7);
		
		System.out.println(s4);
		System.out.println(s);
		
		s.insert(0, "abc");
		System.out.println(s);
		
	}
	public static void main(String args[])
	{
		StringBuffer2 sb2=new StringBuffer2();
		sb2.string();
		
	}
}
