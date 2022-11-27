package Loops;

public class WhileLoop {
	public static void main(String args[]) {
		System.out.println("Inside main increment");
		int i=1;
		while(i<=20)
		{
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println();
		System.out.println("Inside main decrement");
		int j=20;
		while(j>=0)
		{
			System.out.print(j+" ");
			j-=2;
		}
	}
}
