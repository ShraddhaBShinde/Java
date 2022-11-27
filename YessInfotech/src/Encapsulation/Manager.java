package Encapsulation;
import java.util.Scanner;

public class Manager {
	Scanner sc=new Scanner(System.in);
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public double getSalary() {
		return salary;
	}
	public void setId() {
		System.out.println("Enter id ");
		int id=sc.nextInt();
		this.id = id;
	}
	public void setName() {
		System.out.println("Enter name ");
		String name=sc.next();
		this.name = name;
	}
	public void setAddress() {
		System.out.println("Enter address ");
		String address=sc.next();
		this.address = address;
	}
	public void setSalary() {
		System.out.println("Enter salary ");
		double salary=sc.nextDouble();
		this.salary = salary;
	}
	private int id;
	private String name,address;
	private double salary;
	
	
}
