package innerclassdemo;

public class StaticInner {
	static int data=54;
	static class inner
	{
		public void display()
		{
			System.out.println("Data is: "+data);
		}
	}
	public static void main(String args[])
	{
		StaticInner.inner si=new StaticInner.inner();
		si.display();
	}
}
