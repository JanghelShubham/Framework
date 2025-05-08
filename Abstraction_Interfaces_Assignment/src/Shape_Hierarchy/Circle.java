package Shape_Hierarchy;

public class Circle extends Shape {

	public Circle(double radius) {
		super(radius, 0);
	}




	@Override
	protected double calulateArea() {
		// TODO Auto-generated method stub
		return 3.14*dimension1*dimension1;
	}}
