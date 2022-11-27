package Abstraction;

public class Area_Main {
	public static void main(String args[])
	{
		System.out.println("...Square...");
		Area_Square s=new Area_Square();
		s.user_input();
		s.cal_area();
		
		System.out.println("...Circle...");
		Area_Circle c=new Area_Circle();
		c.user_input();
		c.cal_area();
	}
}
