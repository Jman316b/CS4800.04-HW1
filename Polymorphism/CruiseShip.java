package Polymorphism;

public class CruiseShip extends Ship{
	protected int maxNumbOfPassangers;

	public CruiseShip(String name, String year, int maxNumbOfPassangers) {
		super(name, year);
		this.maxNumbOfPassangers = maxNumbOfPassangers;
	}

	public int getMaxNumbOfPassangers() {
		return maxNumbOfPassangers;
	}

	public void setMaxNumbOfPassangers(int maxNumbOfPassangers) {
		this.maxNumbOfPassangers = maxNumbOfPassangers;
	}

	@Override
	public String toString(){
		return ("Ship Name: " + name + ", Maximum Number of Passangers: " + maxNumbOfPassangers);
	}
}
