package practice20; //package name

public class division { //class name
	public void divint()  //no arg and no return type
	{
		int a=545;
		int b=178;
		int c=a/b;
		System.out.println(c);
	}
	public void divdouble()
	{
		double x=2.265487;
		double y=1.12154;
		double z=x/y;
		System.out.println(z);
	}
	public void divintdouble()
	{
		int x=687;
		double y=2.777;
		double z=x/y;
		System.out.println(z);
	}
	public static void main(String args[])
	{
		division d=new division();
		d.divint();
		d.divdouble();
		d.divintdouble();
	}
}
