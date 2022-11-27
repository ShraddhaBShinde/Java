package homework;

public class Discount {
	public static void check(int cost) {
		if(cost>=1000) {
			System.out.println(cost-10*cost/100+" is the price after 10% discount!");
		}
		else {
			System.out.println("Sorry you won't get any discount :(");
		}
	}
	public static void main(String args[]) {
		check(1000);
		check(500);
	}
}
