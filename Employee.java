package Inheritance;

class Employee {
	protected String firstName;
	protected String lastName;
	protected String SSN;
	
	public Employee(String firstName, String lastName, String SSN){
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setSSN(String SSN){
		this.SSN = SSN;
	}
	
	public String getSSN(){
		return SSN;
	}

	public String toString(){
		return firstName + " " + lastName + ", " + SSN;
	}
}