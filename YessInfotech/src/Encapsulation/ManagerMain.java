package Encapsulation;

public class ManagerMain {
	public static void main(String args[])
	{
		Manager m=new Manager();
		//we can also create scanner and take input here
		m.setId(); //and pass variable name inside()
		m.setAddress();
		m.setName();
		m.setSalary();
		
		System.out.println("id "+m.getId());
		System.out.println("Name "+m.getName());
		System.out.println("Address "+m.getAddress());
		System.out.println("Salary "+m.getSalary());
	}
}
