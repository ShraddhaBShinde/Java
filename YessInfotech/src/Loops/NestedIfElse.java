//Blood Donation
package Loops;

public class NestedIfElse {
	public static void check(int age, int weight)
	{
		if(age>=18)
		{
			if(weight>=55)
			{
				System.out.println("As your age is "+age+ " and weight is "+weight+" you are fit to donate blood!");
			}
			else
			{
				System.out.println("You are not fit to donate blood :( due to weight");
			}
		}
		else
		{
			System.out.println("You are under 18, hence not fit to donate blood :(");
		}
	}
	public static void main(String args[])
	{
		check(18,55);
		check(16,45);
		check(19,32);
	}
	
}
