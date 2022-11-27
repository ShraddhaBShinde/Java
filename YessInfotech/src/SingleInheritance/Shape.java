package SingleInheritance;

public class Shape extends Dimension {
	String s;
	public void display()
	{
		System.out.println("Enter Shape ");
		s=sc.next();
	}
	public void cal_rec_area()
	{
		int area=dial*dial2;
		System.out.println("Shape is "+s);
		System.out.println("Area of "+s+" is "+area);
	}
	public static void main(String args[])
	{
		Shape sh=new Shape();
		sh.display();
		sh.user_input();
		sh.cal_rec_area();
	}
}
