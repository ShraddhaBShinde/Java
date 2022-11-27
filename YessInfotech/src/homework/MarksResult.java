package homework;

public class MarksResult {
	public static void result(int marks) {
		if(marks<25)
		{
			System.out.println("Fail!");
		}
		else if((marks>=25) && (marks<45))
		{
			System.out.println("Pass with E grade");
		}
		else if((marks>=45) && (marks<50))
		{
			System.out.println("Pass with D grade");
		}
		else if((marks>=50) && (marks<60))
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
	public static void main(String args[]) {
		result(20);
		result(25);
		result(45);
		result(50);
		result(60);
		result(80);
	}
}
