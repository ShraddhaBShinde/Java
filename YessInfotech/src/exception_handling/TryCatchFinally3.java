package exception_handling;

public class TryCatchFinally3 {
	public static void main(String args[])
	{
		try
		{
			System.out.println(1);
			System.out.println(2);
			System.out.println(9/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println(4);
			System.out.println(5);
		}
	}
}
