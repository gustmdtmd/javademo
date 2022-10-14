package java009_inheritance.part10;

public class SmartTv extends BasicTv {
	String ip;

	public SmartTv() {

	}

	@Override
	public void display() {
		super.display();
		System.out.println("IP:" + ip);
	}
}
