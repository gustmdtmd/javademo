package ncs.test09;

public class Airplane extends Plane {
	public Airplane() {

	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	
	public void flight(int distance) {
		int fuel = distance / 10 * 30;

		System.out.println(fuel);

	}
}
