package Encapsulation;

public class StudentChild {
	public static void main(String args[])
	{
		Student s=new Student();  //as student class is not inherited we have to make class of student class in studentchild class 
		s.display(2, "Shraddha", "Pune");
	}
}
