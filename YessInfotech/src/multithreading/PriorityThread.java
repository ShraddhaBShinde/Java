package multithreading;

public class PriorityThread extends Thread {
	public void run()
	{
		int i;
		for(i=1;i<=3;i++)
		{
			System.out.println("Priority of "+Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());
		}
	}
	public static void main(String args[])
	{
		System.out.println("Priority of main() "+Thread.currentThread().getPriority());
		PriorityThread p=new PriorityThread();
		PriorityThread p1=new PriorityThread();
		PriorityThread p2=new PriorityThread();
		p.start();
		p.setPriority(7);
		p1.start();
		p1.setPriority(2);
		p2.start();
		p2.setPriority(10);
	}
}
