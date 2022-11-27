package practice20;

public class Returnandarg {
	public double div(double num1, double num2)
	{
		return num1/num2;
	}
	public String display(String str)
	{
		return str;
	}
	public static void main(String args[])
	{
		Returnandarg val=new Returnandarg();
		double result=val.div(13.77, 2.22);
		String resultstr=val.display("Result is: ");
		System.out.println(resultstr+result);
	}
}
