package homework;

public class Area_Square extends Abstraction_Area{

	@Override
	public void rectangle_area() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void square_area() {
		System.out.print("Enter side: ");
		double s=sc.nextDouble();
		double area=s*s;
		System.out.println("Area of sqaure is: "+area);
		
	}

	@Override
	public void circle_area() {
		// TODO Auto-generated method stub
		
	}

}
