package InstanceInitializer;

public class Demo {
	int age;
	{  //instance block {}
		System.out.println("I am instance block2");  //2)output is printed  
	}
	{  //instance block {}
		age=58;
		System.out.println("I am instance block");  //3)output is printed  
	}
	public Demo()   //1)constructor is called first->calls the instance block
	{
		System.out.println("I am constructor");  //4)output is printed
		System.out.println("Age is: "+age);
	}
	public static void main(String args[])
	{
		System.out.println("I am executed first"); //1)output is printed
		Demo obj=new Demo();
		System.out.println("I am main method"); //5)output is printed
	}
}
