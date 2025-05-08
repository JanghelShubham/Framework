package Employee_Payroll_System;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee salaried = new SalariedEmployee("nirmal", 122, 55000);
Employee hourly = new HourlyEmployee("viraj", 202, 22, 360);

System.out.println(salaried.calculateSalary());
System.out.println(hourly.calculateSalary());
	}

}
