package Inheritance;

class HourlyEmployee extends Employee {
	protected int wage;
	protected int hoursWorked;

	public HourlyEmployee(String firstName, String lastName, String SSN, int wage, int hoursWorked) {
		super(firstName, lastName, SSN);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}

	public void setWage(int wage){
		this.wage = wage;
	}
	
	public int getWage(){
		return wage;
	}

	public void setHoursWorked(int hoursWorked){
		this.hoursWorked = hoursWorked;
	}
	
	public int getHoursWorked(){
		return hoursWorked;
	}

	public String toString(){
		return firstName + " " + lastName + ", " + SSN + ", Wage: " + wage + ", Hours Worked: " + hoursWorked;
	}
}