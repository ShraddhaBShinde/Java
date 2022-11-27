package Loops;

public class IfElseLadder {
	public void result(int marks)
	{
		if(marks<40)
		{
			System.out.println("Fail!");
		}
		else if((marks>=40) && (marks<60))
		{
			System.out.println("Pass with C grade");
		}
		else if((marks>=60) && (marks<80))
		{
			System.out.println("Pass with B grade");
		}
		else
		{
			System.out.println("Pass with A grade!");
		}
	}
	public static void main(String args[])
	{
		IfElseLadder obj=new IfElseLadder();
		obj.result(39);
		obj.result(40);
		obj.result(60);
		obj.result(80);
		obj.result(91);
	}
}
