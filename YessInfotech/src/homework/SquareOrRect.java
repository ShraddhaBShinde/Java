package homework;

public class SquareOrRect {
	public static void check(int length, int breadth) {
		if(length==breadth)
		{
			System.out.println("It is a square!");
		}
		else
		{
			System.out.println("It is a rectangle!");
		}
	}
	public static void main(String args[])
	{
		check(2,5);
		check(2,2);
	}
}
