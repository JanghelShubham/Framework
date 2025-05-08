package Calculator_Interface;

public class TestCalculator {
	public static void main(String[] args) {
		
		Calculator c1 = new BasicCalculator();
		double no1 =10;
		double no2 =5;
		
		System.out.println(c1.add(no1, no2));
		System.out.println(c1.subtract(no1, no2));
		System.out.println(c1.multiply(no1, no2));
		System.out.println(c1.divide(no1, no2));
		
		
	}

}
