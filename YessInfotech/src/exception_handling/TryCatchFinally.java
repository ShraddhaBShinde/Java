package exception_handling;

public class TryCatchFinally {
	public static void main(String args[])
	{
		System.out.println("1Hello world!!");
		try
		{
			System.out.println("2Hello world!!");
			System.out.println("3Hello world!!");
			System.out.println(10/0);   //runtime exception  (if the exception occurs then lines after the exception are not executed even if they are correct)
		}
		catch(Exception e)   //parent class of checked and unchecked classes
		{
			System.out.println(e);
		}
		finally   //it always excecute even if there is an exception
		{
			System.out.println("4Hello world!!");
		}
		System.out.println("5Hello world!!");
	}
}
