package exception_handling;

public class TryCatchFinally2 {
	public static void main(String args[])
	{
		int arr[]= {24,46,69,36};
		try
		{
			System.out.println(arr[2]);
			System.out.println(arr[56]);
		}
		catch(Exception e)
		{
			e.printStackTrace();   //gives where the exception has occured 
		}
		System.out.println("1Hello world!!");
		System.out.println("2Hello world!!");
		System.out.println("Exception Handling");
		try               //can write more than one try catch
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("Oops! Invalid output"+e);  //can also customize the output when exception has occured
		}
	}
}
