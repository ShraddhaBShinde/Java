package SingleInheritance;

//extends to inherit
public class Car extends Vehicle {
	public void car_name(String name)
	{
		System.out.println("Car name is "+name);
	}
	public static void main(String args[])
	{
		Car c=new Car();          //object of car is created as a child can inherit properties from parent but a parent cannot (it is unidirectional)
		c.ve_type("4-wheeler");
		c.car_name("BMW");
	}
}
