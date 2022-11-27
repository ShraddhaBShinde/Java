package multithreading;

public class Thread2 implements Runnable{ // Runnable->Interface
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println(i+" : Thread "+Thread.currentThread().getId()+" is running");
		}
	}
	public static void main(String args[])
	{
		Thread2 th=new Thread2();
		Thread t=new Thread(th);
		Thread t2=new Thread(th);
		t.start();
		t2.start();
	}
}
