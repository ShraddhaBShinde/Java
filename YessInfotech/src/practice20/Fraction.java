package practice20;

public class Fraction {
	public void fractionCal(int num, int deno) {
		int fractionalVal=num/deno;
		System.out.println(fractionalVal);
	}
	public static void main(String args[]) {
		Fraction frac=new Fraction();
		frac.fractionCal(4, 2);
		frac.fractionCal(12, 2);
		frac.fractionCal(20, 2);	
	}
}
