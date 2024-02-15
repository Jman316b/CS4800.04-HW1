package Inheritance;

class Main {
	public static void main(String[] args){
		SalariedEmployee Joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
		HourlyEmployee Stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
		HourlyEmployee Mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
		CommissionEmployee Nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
		SalariedEmployee Renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
		BaseEmployee Mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
		CommissionEmployee Mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

		System.out.println("First name Last name, Social Sec #, Relevant Fields");
		System.out.println(Joe.toString());
		System.out.println(Stephanie.toString());
		System.out.println(Mary.toString());
		System.out.println(Nicole.toString());
		System.out.println(Renwa.toString());
		System.out.println(Mike.toString());
		System.out.println(Mahnaz.toString());
	}
}
