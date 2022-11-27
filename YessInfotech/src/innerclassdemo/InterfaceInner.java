package innerclassdemo;

interface Showable
{
	interface Callable  //interface inside interface ->can also implement interface inside class
	{
		public void call();
	}
}

public class InterfaceInner implements Showable.Callable {

	@Override
	public void call() {
		System.out.println("Call method from inner interface");
		
	}
	public static void main(String args[])
	{
		InterfaceInner i=new InterfaceInner();
		i.call();
	}

}
