package homework;

public class GreaterVal {
	public static void check(int val1, int val2) {
		if(val1>val2)
		{
			System.out.println(val1+" is greater than "+val2);
		}
		else
		{
			System.out.println(val1+" is smaller than "+val2);
		}
	}
	public static void main(String args[]) {
		check(2,7);
		check(7,2);
	}
}
