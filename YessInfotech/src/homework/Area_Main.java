package homework;

public class Area_Main {
	public static void main(String args[])
	{
		System.out.println("...Rectangle...");
		Area_Rectangle r=new Area_Rectangle();
		r.rectangle_area();
		
		System.out.println("...Square...");
		Area_Square s=new Area_Square();
		s.square_area();
		
		System.out.print("...Circle...");
		Area_Circle c=new Area_Circle();
		c.circle_area();
	}
}
