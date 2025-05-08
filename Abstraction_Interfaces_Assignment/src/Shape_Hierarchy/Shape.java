package Shape_Hierarchy;

public abstract class Shape {
	
	protected double dimension1;
	protected double dimenshion2;
	public Shape(double dimension1, double dimenshion2) {
		
		this.dimension1 = dimension1;
		this.dimenshion2 = dimenshion2;
		
		
	}
	public double getDimension1() {
		return dimension1;
	}
	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}
	public double getDimenshion2() {
		return dimenshion2;
	}
	public void setDimenshion2(double dimenshion2) {
		this.dimenshion2 = dimenshion2;
	}
	protected abstract double calulateArea();
	

}
