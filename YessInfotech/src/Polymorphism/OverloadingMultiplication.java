package Polymorphism;

public class OverloadingMultiplication {
	public void mul()
	{
		System.out.println("First method: "+2*7);
	}
	public void mul(int a,double b)
	{
		double c=a*b;
		System.out.println("Second method: "+c);
	}
	public void mul(String s, String s2)
	{
		String s3=s+s2;
		System.out.println("Third method: "+s3);
	}
	public void mul(int num1, double num2, double num3)
	{
		double ans=num1*num2*num3;
		System.out.println("Fourth method: "+ans);
	}
	public void mul(double numm, double numm2)
	{
		double ans=numm*numm2;
		System.out.println("Fifth method: "+ans);
	}
	public void mul(int x, int y)
	{
		double z=x*y;
		System.out.println("Sixth method: "+z);
	}
	
	public static void main(String args[])
	{
		OverloadingMultiplication om=new OverloadingMultiplication();
		om.mul();
		om.mul(2, 2.10);
		om.mul("hello", "world");
		om.mul(2, 2.7, 13.1000);
		om.mul(2.1785, 5.24);
		om.mul(7, 2);
	}
	
}
