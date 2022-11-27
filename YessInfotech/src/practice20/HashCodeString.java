package practice20;

public class HashCodeString {
	public String toString() {   //when we create a method toString we can give the output we want to display
		return "I am toString";
	}
	public static void main(String args[])
	{
		HashCodeString obj=new HashCodeString();
		System.out.println(obj);
	}
}
