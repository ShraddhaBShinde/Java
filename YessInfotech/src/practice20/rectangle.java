package practice20; //package name

public class rectangle { //class name
	public void areaOfRect(int length, int breadth) //user defined method with args and no return type
	{
		int area=length*breadth;
		System.out.println("Area of rectangle is: "+area);
	}
	public void periOfRect(int length, int breadth) //user defined method with args and no return type
	{
		int peri=2*(length+breadth);
		System.out.println("Perimeter of rectangle is: "+peri);
	}
	public static void main(String args[]) {
		rectangle r = new rectangle();
		r.areaOfRect(2,7);
		r.periOfRect(2,7);	
	}

}
