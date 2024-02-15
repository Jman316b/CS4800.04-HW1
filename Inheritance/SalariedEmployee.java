package Inheritance;

class SalariedEmployee extends Employee {
	protected int weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String SSN, int weeklySalary) {
		super(firstName, lastName, SSN);
		this.weeklySalary = weeklySalary;
	}

	public void setgetWeeklySalary(int weeklySalary){
		this.weeklySalary = weeklySalary;
	}
	
	public int getWeeklySalary(){
		return weeklySalary;
	}

	public String toString(){
		return firstName + " " + lastName + ", " + SSN + ", Weekly Salary: " + weeklySalary;
	}
}
