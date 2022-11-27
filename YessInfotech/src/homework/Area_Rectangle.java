package homework;

public class Area_Rectangle extends Abstraction_Area {

	@Override
	public void rectangle_area() {
		System.out.print("Enter length and breadth: ");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double area=l*b;
		System.out.println("Area of rectangle is: "+area);
		
	}

	@Override
	public void square_area() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void circle_area() {
		// TODO Auto-generated method stub
		
	}
	
}
