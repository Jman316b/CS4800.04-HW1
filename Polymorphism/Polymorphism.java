package Polymorphism;

class Main {
	public static void main(String[] args) {
		Ship[] ships = new Ship[3];
		ships[0] = new Ship("Queen Victoria", "1989");
		ships[1] = new CruiseShip("Queen Mary", "1992", 245);
		ships[2] = new CargoShip("Sparrow", "2002", 300);

		for (Ship ship : ships) {
			System.out.println(ship.toString());
		}
	}
}
