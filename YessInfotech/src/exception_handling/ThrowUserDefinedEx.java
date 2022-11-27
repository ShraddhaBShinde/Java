package exception_handling;

public class ThrowUserDefinedEx {
	public static void main(String args[])
	{
		int age=8;
		if(age<18)
		{
			throw new ArithmeticException("Age is invalid");
		}
		else
		{
			System.out.println("login completed");
		}
	}
}
