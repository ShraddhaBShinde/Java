package custom_exception;

public class InvalidAgeExceptionMain {
	public void check(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException();
		}
		else
		{
			System.out.println("done");
		}
	}
	public static void main(String args[])
	{
		InvalidAgeExceptionMain m=new InvalidAgeExceptionMain();
		try
		{
			m.check(26);
			m.check(5);
			m.check(48);
		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
		}
	}
}
