package Inheritance;

class CommissionEmployee extends Employee {
	protected int commissionRate;
	protected int grossSales;

	public CommissionEmployee(String firstName, String lastName, String SSN, int commissionRate, int grossSales) {
		super(firstName, lastName, SSN);
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}

	public void setCommissionRate(int commissionRate){
		this.commissionRate = commissionRate;
	}
	
	public int getCommissionRate(){
		return commissionRate;
	}

	public void setGrossSales(int grossSales){
		this.grossSales = grossSales;
	}
	
	public int getGrossSales(){
		return grossSales;
	}

	public String toString(){
		return firstName + " " + lastName + ", " + SSN + ", Commission Rate: " + commissionRate + ", Gross Sales: " + grossSales;
	}
}
