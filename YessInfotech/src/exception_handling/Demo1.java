package exception_handling;

//Classes in java
//Object->Throwable->Exception-(Checked,unchecked)(checked->compiletime)(unchecked->runtime)
//                |->Error

public class Demo1 {
	public static void main(String args[])
	{
		System.out.println("1Hello world!!");
		try
		{
			System.out.println("2Hello world!!");
			System.out.println("3Hello world!!");
			System.out.println(10/0);   //runtime exception  (if the exception occurs then lines after the exception are not executed even if they are correct)
			System.out.println("4Hello world!!");
		}
		catch(Exception e)   //parent class of checked and unchecked classes
		{
			System.out.println(e);
		}
		System.out.println("5Hello world!!");
	}
}
