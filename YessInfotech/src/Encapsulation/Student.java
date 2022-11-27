package Encapsulation;

public class Student {
	private int id;
	private String name,address;  //1)these variables are declared as private hence we cannot use them directly outside the class
	
	public void display(int i,String n,String a)  //binding the variables in public 
	{
		id=i;
		name=n;
		address=a;//2)hence we wrote them in public void method so that we can access them outside the class 
		System.out.println("Id is "+i);
		System.out.println("Name is "+n);
		System.out.println("Address is "+a);
	}
}
