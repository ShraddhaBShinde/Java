package multithreading;

public class Methods extends Thread{  //Thread->Class
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+" : "+Thread.currentThread().getName()+" is running");
		}
	}
	public static void main(String args[])
	{
		Methods m=new Methods();
		Methods m1=new Methods();
		m.setName("First");
		m1.setName("Second");
		m.start();
		m1.start();
	}
}
