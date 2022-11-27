package Arrays;
import java.util.Scanner;

class Employee {
	int eid;
	String ename;
	double sal;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter Name");
		ename=sc.next();
		System.out.println("Enter ID");
		eid=sc.nextInt();
		System.out.println("Enter Salary");
		sal=sc.nextDouble();
	}
	void show()
	{
		System.out.println("Employee Name is: "+ename);
		System.out.println("Employee ID is: "+eid);
		System.out.println("Employee Salary is: "+sal);
	}
	static void sort(int n,Employee s[])
	{
		int i,j;
		int eid;
		String name;
		double sal;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s[i].sal<s[j].sal)
				{
					eid=s[i].eid;
					s[i].eid=s[j].eid;
					s[j].eid=eid;
					
					name=s[i].ename;
					s[i].ename=s[j].ename;
					s[j].ename=name;
					
					sal=s[i].sal;
					s[i].sal=s[j].sal;
					s[j].sal=sal;
				}
			}
		}
	}
}
public class ArrayObject
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee e[]=new Employee[10];
		System.out.println("How many employee: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			e[i]=new Employee();
			e[i].accept();
		}
		Employee.sort(n,e);
		System.out.println(".....info.....");
		for(int i=0;i<n;i++)
		{
			e[i].show();
		}
	}
}
