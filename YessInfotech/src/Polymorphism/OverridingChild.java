package Polymorphism;

public class OverridingChild extends Overriding1 {
	@Override
	public void cal_area() {
		super.cal_area();   //to print the body of cal_area method from parent class (without it only this method will be the output)
		double area=d1*d2;
		System.out.println("Area of rectangle is: "+area);
	}
}
