package practice20; //package

public class all_cals {  //class name
	public void cals(int num1, double num2)  //user defined method with args and no return type
	{
		double sum=num1+num2;
		System.out.println("Addition is: "+sum);
		double sub=num1-num2;
		System.out.println("Subtraction is: "+sub);
		double mul=num1*num2;
		System.out.println("Multiplication is: "+mul);
		double div=num1/num2;
		System.out.println("Division is: "+div);
		
		System.out.println("calculations: "+sum+", "+sub+", "+mul+", "+div);
		
	}
	public static void main(String args[])
	{
		all_cals c=new all_cals();
		c.cals(2, 7.13);
		System.out.println(" ");
		c.cals(27, 13);
		System.out.println();
		c.cals(213, 7);
	}
}
