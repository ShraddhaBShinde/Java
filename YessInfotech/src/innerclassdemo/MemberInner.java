package innerclassdemo;

//non-static
public class MemberInner {
	int data=466;
	class inner   //inner class
	{
		public void display()
		{
			System.out.println("Value of data is: "+data);
			System.out.println("This is inner class");
		}
	}
	public static void main(String args[])
	{
		MemberInner mi=new MemberInner();  //object creation of main class
		MemberInner.inner obj=mi.new inner();  //object creation of inner class
		obj.display();
	}
}
