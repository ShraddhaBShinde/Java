package practice20;

public class Variables {
	int c;    //instance variables
	static int d1=12;  //static variable
	public void add()
	{
		int a=4;   //local variables
		int b=7;
		c=a+b;
	}
	public void display()
	{
		System.out.println("I am instance variable: "+c);
	}
	public static void main(String args[])
	{
		Variables v=new Variables();
		v.add();
		v.display();
		System.out.println("I am static variable: "+d1);
	}
}
