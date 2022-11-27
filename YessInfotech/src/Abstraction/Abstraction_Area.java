package Abstraction;

//abstraction->showing only essential data to user
//Abstract class->we can make a class abstract even if it dosen't have any abstract methods in it(doing this we cannot make object of that class->we need to use another class to access its members)
//but we cannot make abstract methods inside a class without making the class abstract

import java.util.*;

public abstract class Abstraction_Area {
	Scanner sc=new Scanner(System.in);
	int dim;
	public void user_input()
	{
		System.out.println("Enter value of dimension: ");
		dim=sc.nextInt();
	}
	public abstract void cal_area();  //abstract method does not have body
}
