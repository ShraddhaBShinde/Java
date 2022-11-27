package multithreading;

public class ThreadMethod extends Thread {
	public void run()
	{
		for(int i=1;i<3;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String args[])
	{
		ThreadMethod j=new ThreadMethod();
		ThreadMethod j2=new ThreadMethod();
		ThreadMethod j3=new ThreadMethod();
		j.setName("J");
		j2.setName("J2");
		j.start();
		//j.join(); execute first itself then remianing thread will get executed
		j.yield();  //wait until other thread get executed
		j2.start();
		j3.start();
	}
}
