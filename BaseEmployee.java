package Inheritance;

class BaseEmployee extends Employee {
	protected int baseSalary;

	public BaseEmployee(String firstName, String lastName, String SSN, int baseSalary) {
		super(firstName, lastName, SSN);
		this.baseSalary = baseSalary;
	}

	public void setBaseSalary(int baseSalary){
		this.baseSalary = baseSalary;
	}
	
	public int getBaseSalary(){
		return baseSalary;
	}

	public String toString(){
		return firstName + " " + lastName + ", " + SSN + ", Base Salary: " + baseSalary;
	}
}