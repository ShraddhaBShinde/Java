package Polymorphism;  
//Polymorphism->overloading/method overloading/compile time polymorphism/static polymorphism


//overloading->sharing->(args, return type etc)
//->1.method overloading
//->2.compile/static time(it executes in compile time)
//->args, return type are changed, method name is same 

public class Overloading {
	public void add()
	{
		System.out.println(5+5);
	}
	public void add(int num)
	{
		System.out.println(num+10);
	}
	public void add(double num1,int num2)
	{
		System.out.println(num1+num2);
	}
	public static void main(String args[])
	{
		Overloading o=new Overloading();
		o.add();
		o.add(7);
		o.add(2.13, 7);
	}
}
