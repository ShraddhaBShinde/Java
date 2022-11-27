package MultiLevelInheritance;

public class Teacher extends School//class
{
	public void te_details(String n)//method
	{
		System.out.println("Teacher name is "+n);
	}
}
//student is last child and can acess properties for both the parents grandfather->father->son
