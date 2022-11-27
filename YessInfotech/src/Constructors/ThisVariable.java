package Constructors;

public class ThisVariable {
	int a;
	String uname,uaddress;
	public ThisVariable(int a, String uname, String uaddress) {
		super();   //it is not required
		this.a = a;
		this.uname = uname;
		this.uaddress = uaddress;
		System.out.println(a+" "+uname+" "+uaddress);
	}
	public static void main(String args[])
	{
		ThisVariable v=new ThisVariable(2,"Shraddha","Nashik");
		ThisVariable v1=new ThisVariable(7,"Anjali","Nashik");
	}
}
