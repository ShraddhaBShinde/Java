package Strings;
import java.util.StringJoiner;

public class StringJoinerClass {
	public void string()
	{
		StringJoiner s=new StringJoiner(",");
		s.add("hello");
		s.add("this");
		s.add("is");
		s.add("StringJoiner");
		System.out.println(s);
		System.out.println(s.length());
		
		StringJoiner s2=new StringJoiner("-");
		s2.setEmptyValue("empty");  //tells that no elements have been added yet (Java 8)
		System.out.println(s2);
		
		s2.add("abcpqr");
		s2.add("new");
		System.out.println(s2);
		System.out.println(s.merge(s2));
		
	}
	public static void main(String args[])
	{
		StringJoinerClass sj=new StringJoinerClass();
		sj.string();
	}
	
}
