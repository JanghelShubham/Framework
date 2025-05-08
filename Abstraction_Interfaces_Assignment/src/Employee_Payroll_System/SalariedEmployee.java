package Employee_Payroll_System;

public class SalariedEmployee extends Employee {
	private double anualSalary;

	public SalariedEmployee(String name, int id, double anualSalary) {
		super(name, id);
		this.anualSalary = anualSalary;
	}
	
	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return anualSalary;
	}
	

}
