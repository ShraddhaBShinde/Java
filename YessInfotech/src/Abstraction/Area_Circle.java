package Abstraction;

public class Area_Circle extends Abstraction_Area {

	@Override
	public void cal_area() {
		double area=3.14*dim*dim;
		System.out.println("Area of circle is: "+area);
	}

}
