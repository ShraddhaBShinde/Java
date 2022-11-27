package practice20;
import java.util.Scanner;

public class Employee {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id: ");
		int id=sc.nextInt();
		System.out.println("Enter employee name: ");
		String name=sc.next() ;
		System.out.println("Enter salary: ");
		int salary=sc.nextInt();
		int da=salary*10/100;
		int hra=salary*15/100;
		int gross_salary=salary+da+hra;
		System.out.println("Gross salary is: "+gross_salary);
		
	}
}
