package Animal_Behaviour_Interface;

public class Dog implements AnimalBehavior {
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Dog is Sleeping");
	}

}
