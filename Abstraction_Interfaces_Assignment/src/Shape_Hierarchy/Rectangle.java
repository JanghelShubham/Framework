package Shape_Hierarchy;

public class Rectangle extends Shape {
	
	public Rectangle (double length,double width) {
		super(length,width);
		
		
	}
	@Override
	protected double calulateArea() {
		// TODO Auto-generated method stub
		return dimension1*dimenshion2;
	}

}
