package innerclassdemo;

//non-static
public class LocalInner {
	public void display() //variables inside method cannot be static
	{
		int data=664;  //we can access data in details() because it is inside same method
		System.out.println("Display method");
		class localinner  //local inner class (cannot be static)
		{
			public void details()
			{
				System.out.println("Data is: "+data);
				System.out.println("Details method");
			}
		}
		localinner li=new localinner();   //this object cannot be created in the main
		li.details();
	}
	public static void main(String args[])
	{
		LocalInner obj=new LocalInner();
		obj.display();
	}
	
}
