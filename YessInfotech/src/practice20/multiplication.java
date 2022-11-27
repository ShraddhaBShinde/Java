package practice20;  //package name

public class multiplication {  //class name
	public void mulint()  //user defined method with no args and no return type
	{
		int a=545;
		int b=178;
		int c=a*b;
		System.out.println(c);
	}
	public void muldouble() //user defined method with no args and no return type
	{
		double x=2.265487;
		double y=1.12154;
		double z=x*y;
		System.out.println(z);
	}
	public void mulintdouble() //user defined method with no args and no return type
	{
		int x=687;
		double y=2.777;
		double z=x*y;
		System.out.println(z);
	}
	public static void main(String args[])
	{
		multiplication m=new multiplication();
		m.mulint();
		m.muldouble();
		m.mulintdouble();
	}
}
