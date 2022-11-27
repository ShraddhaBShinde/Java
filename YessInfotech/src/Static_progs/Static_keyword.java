package Static_progs;

public class Static_keyword {  //static methods
	public static void add()    //no args and no return type
	{
		System.out.println("Addition is: "+(2+7));
	}
	public static void sub(int a, int b)  //with args and no return type
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	public static char display()  //no args and with return type
	{
		return 'A';
	}
	public static double mul(int d1, double d2)  //with args and with return type
	{
		return d1*d2;
	}
	public static void main(String args[])
	{
		add();
		sub(7,2);
		System.out.println("Char is: "+display());
		System.out.println("Multiplication is: "+mul(2,7.13));
	}
}
