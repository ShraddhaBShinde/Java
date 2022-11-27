package practice20;  //package name

public class subtraction {  //class name
	public void subint(int x, int y) //user defined method with args and no return type
	{
		int z=x-y;
		System.out.println(z);
	}
	public void subdouble(double x, double y) //user defined method with args and no return type
	{
		double z=x-y;
		System.out.println(z);
	}
	public void subintdouble(int x, double y) //user defined method with args and no return type
	{
		double z=x-y;
		System.out.println(z);
	}
	public static void main(String args[])
	{
		subtraction s=new subtraction();
		s.subint(1,2);
		s.subdouble(2.2,1.1);
		s.subintdouble(2,1.1);
	}
}
