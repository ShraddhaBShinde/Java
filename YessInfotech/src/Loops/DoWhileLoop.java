package Loops;

public class DoWhileLoop {
	public static void FalseCondition() {
		System.out.println("False Condition");
		int num=10;
		do
		{
			System.out.print(num+" ");
			num++;
		}
		while(num<=5);
	}
	public static void TrueCondition() {
		System.out.println();
		System.out.println("True Condition");
		int num2=1;
		do
		{
			System.out.print(num2+" ");
			num2++;
		}
		while(num2<=5);
	}
	public static void Decrement() {
		System.out.println();
		System.out.println("Decrement from 50");
		int i=50;
		do
		{
			System.out.print(i+" ");
			i-=2;
		}
		while(i>=1);
	}
	public static void main(String args[])
	{
		FalseCondition();
		TrueCondition();
		Decrement();
	}
}
