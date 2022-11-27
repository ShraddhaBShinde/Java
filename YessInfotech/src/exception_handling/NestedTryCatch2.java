package exception_handling;

//try&catch->for runtime exceptions
public class NestedTryCatch2 {
	public static void main(String args[])
	{
		try
		{
			int arr[]=new int[3];
			arr[3]=30/0;
			String s=null;
			String s1=s.concat("abc");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
		finally
		{
			System.out.println("java exception");
		}
	}
	
}
