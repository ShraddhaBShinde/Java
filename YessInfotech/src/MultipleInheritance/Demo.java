package MultipleInheritance;

//child is a class
public class Demo implements Callable,Showable{

	@Override
	public void show() {
		System.out.println("Show method from showable interface");
		
	}

	@Override
	public void call() {
		System.out.println("Call method from callable interface");
		
	}

	@Override
	public void display() {
		System.out.println("Display method from both interfaces");   //classname.variablename
		System.out.println("Value of x from showable: "+Showable.x); //Showable.x-> x is static final and is ambiguous when call alone
		System.out.println("Value of x from callable: "+Callable.x);
		
	}
	
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.show();
		d.call();
		d.display();
	}
}
