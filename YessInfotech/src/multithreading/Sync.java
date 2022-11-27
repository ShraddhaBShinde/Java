package multithreading;

import java.io.*;

class Sender
{
	synchronized public void send(String msg)  //as it is synchronized 	thread 1 will not interfere in thread 2
	//public void send(String msg)
	{
		System.out.println("Sending\t" + msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Thread interrupted");
		}
		System.out.println("\n"+msg+" Sent");
		System.out.println();
	}
}
class ThreadedSend extends Thread{
	private String msg;
	Sender sender;
	ThreadedSend(String m,Sender obj)
	{
		msg=m;
		sender=obj;
	}
	public void run()
	{
		sender.send(msg);
	}
}
public class Sync {
	public static void main(String args[])
	{
		Sender send=new Sender();
		ThreadedSend S1=new ThreadedSend("First msg",send);
		ThreadedSend S2=new ThreadedSend("Second msg",send);
		S1.start();
		S2.start();
	}
}
