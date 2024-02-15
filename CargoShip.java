package Polymorphism;

public class CargoShip extends Ship {
	protected int cargoCapacity;

	public CargoShip(String name, String year, int cargoCapacity) {
		super(name, year);
		this.cargoCapacity = cargoCapacity;
	}

	public int getTonnage() {
		return cargoCapacity;
	}

	public void setTonnage(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public String toString(){
		return ("Ship Name: " + name + ", Cargo Capacity: " + cargoCapacity);
	}
}
