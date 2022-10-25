package ncs.test09;

abstract public class Plane {
	private String planeName;
	private int fuelSize;
	
	public Plane() {
	
	}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
	 int refuel = 200;	
	}
	
	public abstract void flight(int distance);
	
	
}
