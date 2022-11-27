package homework;

public class SalaryBonus {
	public static void check(int salary, int year) {
		if(year<=2016) {
			System.out.println(salary+5*salary/100+" is the final salary with bonus.");
		}
		else {
			System.out.println(salary+" is the final salary without bonus.");
		}
	}
	public static void main(String args[]) {
		check(50000,2014);
		check(50000,2020);
	}
}
