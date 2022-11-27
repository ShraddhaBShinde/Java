//Date : 23/08/22
package practice20;

public class Methodreturntype {
	public int add()  //user defined method without args and with return type
	{
		return 2+7;
	}
	public int sub()  //user defined method without args and with return type
	{
		return 7-2;
	}
	public String display()  //user defined method without args and with return type
	{
		return "Hello World!";
	}
	public static void main(String args[])
	{
		Methodreturntype m=new Methodreturntype();
		System.out.println("Addition is: "+m.add());
		int sub=m.sub();  //to store the return part
		System.out.println("Subtraction is: "+sub);
		String msg=m.display();  //to store the return part
		System.out.println(msg+" Spreading happiness!");
	}
}
