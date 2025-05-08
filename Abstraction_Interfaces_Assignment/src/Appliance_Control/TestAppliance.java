package Appliance_Control;

public class TestAppliance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Appliance washingMachine = new WashingMachine();
		Appliance refrigerator = new Refrigerator();
		
		washingMachine.turnOn();
		washingMachine.turnOf();
		
		refrigerator.turnOn();
		refrigerator.turnOf();

	}

}
