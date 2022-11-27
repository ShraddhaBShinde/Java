package exception_handling;

public class ThrowsDemo {
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("pause for 3 secs");
		Thread.sleep(3000); //unhandled exception
		System.out.println("...after 3 secs...now pause for 5 secs");
		Thread.sleep(5000);
		System.out.println("...after 5 secs");
	}
}
