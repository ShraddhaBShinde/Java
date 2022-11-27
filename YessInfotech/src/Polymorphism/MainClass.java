package Polymorphism;

public class MainClass {
	public static void main(String args[])
	{
			
			OverridingChild oc=new OverridingChild();  //for rectangle
			oc.user_input();
			oc.cal_area();
			
			OverridingChild2 oc2=new OverridingChild2();  //for triangle
			oc2.user_input_triangle();
			oc2.cal_area();
		
	}
}
