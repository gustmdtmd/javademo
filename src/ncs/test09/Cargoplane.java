package ncs.test09;

public class Cargoplane extends Plane {
	public Cargoplane() {

	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	public void flight(int distance) {
		
		int fuel = distance/10*50;
		
		System.out.println(fuel);
	}
}
