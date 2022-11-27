package SingleInheritance;

public class ChildClass2 {
	public void child()
	{
		System.out.println("This is the child class");
	}
	public static void main(String args[])
	{
		ChildClass2 cc=new ChildClass2();
		cc.child();
		
		ParentClass2 pc=new ParentClass2();
		pc.parent();
	}
}
