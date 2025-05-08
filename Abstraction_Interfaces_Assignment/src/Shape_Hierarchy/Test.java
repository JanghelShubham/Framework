package Shape_Hierarchy;

public class Test {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape rec = new Rectangle(5, 6);
		
		System.out.println(circle.calulateArea());
		System.out.println(rec.calulateArea());
	}

}
