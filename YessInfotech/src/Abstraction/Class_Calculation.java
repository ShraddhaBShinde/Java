package Abstraction;

//to inherit parent 'implements' keyword is used
public class Class_Calculation implements Interface_Cal {

	@Override
	public void add() {
		System.out.println("Addition is: "+(2+7));
	}

	@Override
	public void sub() {
		System.out.println("Addition is: "+(2-7));
		
	}
	
	public static void main(String args[])
	{
		Class_Calculation cc=new Class_Calculation();
		cc.add();
		cc.sub();		
	}
}
