
public class Circle {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	// the area of the circle (π * r^2)
	public double calculateArea() {
		return Math.PI * radius * radius; // Math.PI gives the value of π
	}

	// circumference of the circle (2 * π * r)
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public static void main(String[] args) {

		Circle circle1 = new Circle(7.0);

		System.out.println("Circle with radius: " + circle1.getRadius());
		System.out.println("Area: " + circle1.calculateArea());
		System.out.println("Circumference: " + circle1.calculateCircumference());

	}
}
