package Constructors;

public class ThisVariable2 {
	int i;
	String country;
	public ThisVariable2(int i, String country) {
		super();
		this.i = i;
		this.country = country;
		System.out.println(country+" scored "+i+" in yesterdays match.");
	}
	public static void main(String args[])
	{
		ThisVariable2 t=new ThisVariable2(184,"India");
	}
}
