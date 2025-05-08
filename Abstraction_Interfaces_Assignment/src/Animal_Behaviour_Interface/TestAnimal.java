package Animal_Behaviour_Interface;

public class TestAnimal {
	public static void main(String[] args) {
		AnimalBehavior dog = new Dog();
		AnimalBehavior cat = new Cat();

		dog.eat();
		dog.sleep();
		cat.eat();
		cat.sleep();
	}
}
