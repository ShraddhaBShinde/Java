package homework;

public class Area_Circle extends Abstraction_Area {

	@Override
	public void rectangle_area() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void square_area() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void circle_area() {
		System.out.println("Enter radius: ");
		double r=sc.nextDouble();
		double area=3.14*r*r;
		System.out.println("Area of circle is: "+area);
		
	}

}
