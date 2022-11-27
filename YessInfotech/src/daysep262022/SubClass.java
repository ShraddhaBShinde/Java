package daysep262022;

public class SubClass extends AbstractClass {

	@Override
	public void a_method() {
		System.out.println("This is abstract method");
		
	}
	public static void main(String args[])
	{
		SubClass sb=new SubClass();
		sb.a_method();
		sb.non_abstract();
	}
	

}
