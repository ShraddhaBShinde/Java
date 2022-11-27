package MultiLevelInheritance;

public class Student extends Teacher
{
	public void st_details(String p)
	{
		System.out.println("Student name is "+p);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.st_details("JOhn");
		s1.te_details("Shatakshi");
		s1.name("NES");

	}
}
