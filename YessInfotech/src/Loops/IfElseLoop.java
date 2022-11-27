package Loops;

public class IfElseLoop {
	public void Demo()   //to check whether adult or minor
	{
		int age=12;
		if(age<18)
		{
			System.out.println("Access denied as you are below 18!");
		}
		else
		{
			System.out.println("Access given as you are above 18!");
		}
	}
	public static void check(int num)   //to check even/odd
	{
		if(num%2==0)
		{
			System.out.println(num+" is even!");
		}
		else
		{
			System.out.println(num+" is odd!");
		}
	}
	public static void main(String args[]) {
		IfElseLoop obj=new IfElseLoop();
		obj.Demo();
		check(887643486);  //as the method is static we can access without an object
		check(7);
	}
}
