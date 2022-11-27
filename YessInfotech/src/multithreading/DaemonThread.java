package multithreading;

public class DaemonThread extends Thread {
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName()+" is Daemon");
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" is not Daemon");
		}
	}
	public static void main(String args[])
	{
		DaemonThread d=new DaemonThread();
		DaemonThread d2=new DaemonThread();
		d.setName("d");
		d2.setName("d2");
		d2.setDaemon(true);
		d.start();
		d2.start();
	}
}
