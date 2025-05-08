package Employee_Payroll_System;

public class HourlyEmployee extends Employee {

	private double hourlyRate;
	private int hoursWorked;

	public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return hourlyRate*hoursWorked;
	}
}
