package Multiple_Inheritance_by_Interfaces;

public class Duck implements Flyable, Swimmable {
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Duck is flying");
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Duck is swimming");
	}

}
