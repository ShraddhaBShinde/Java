package practice20;  //package name

public class methodClass {  //class name
	public void methodName()  //user defined method with no args and no return type
	{
		System.out.println("I am 1 from methodName");
		System.out.println("I am 2 from methodName");
		System.out.println("I am 3 from methodName");
	}
	public void methodName2()
	{
		System.out.println("I am 1 from methodName2");
		System.out.println("I am 2 from methodName2");
		System.out.println("I am 3 from methodName2");
	}
	public void addint()
	{
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println(c);
	}
	public void adddouble()
	{
		double x=1.1;
		double y=2.2;
		double z=x+y;
		System.out.println(z);
	}
	public void addintdouble()
	{
		int x=1;
		double y=2.2;
		double z=x+y;
		System.out.println(z);
	}
	public void mulintdouble()
	{
		int x=6;
		double y=2.2;
		double z=x+y;
		System.out.println(z);
	}
	public static void main(String args[])
	{
		methodClass a=new methodClass();  //object creation, new->keyword
		a.methodName();  //calling method
		a.methodName2();
		System.out.print("Integer addition: ");
		a.addint();
		System.out.print("Double addition: ");
		a.adddouble();
		System.out.print("Int and double addition: ");
		a.addintdouble();
		System.out.print("Int and double multiplication: ");
		a.mulintdouble();
	}
}
