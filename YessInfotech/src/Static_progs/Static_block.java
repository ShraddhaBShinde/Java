package Static_progs;

public class Static_block {
	static
	{
		int a=2;
		int b=7;
		int c=a+b;
		System.out.println("This is output from static block: "+c);
	}
	static
	{
		System.out.println("I am 2nd static block!");
	}
	public static void main(String args[])
	{
		System.out.println("This is main method, but its's not compulsory to fill me :)");
	}
	static
	{
		System.out.println("I am 2nd static block!");
	}
}
