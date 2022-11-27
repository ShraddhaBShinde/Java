package exception_handling;

public class NestedTryCatch {
	public static void display()
	{
		try
		{
			//String s1=null;
			//System.out.println(s1.length());  //shows only one exception
			try
			{
				System.out.println(10/0);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			String s=null;
			System.out.println(s.length());   //shows two exceptions (10/0&null)
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//String s1="null";
		//System.out.println(s1.length()); //gives output 4
	}
	public static void main(String args[])
	{
		display();
	}
}
