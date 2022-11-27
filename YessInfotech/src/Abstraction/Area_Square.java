package Abstraction;

public class Area_Square extends Abstraction_Area {

	@Override  //even if we don't give override annotation it won't give any errors but a user can change the inside things by doing this
	public void cal_area() {
		int area=dim*dim;
		System.out.println("Area of square is: "+area);
	}
	
}
