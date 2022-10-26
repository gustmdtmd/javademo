package java020_thread.prob;

public class Producer extends Thread {
	private VendingMachine vm;
	
	public Producer() {

	}

	public Producer(VendingMachine vm) {
		this.vm=vm;
	}
	
	@Override
	public void run() {
	vm.putDrink(getName());
	}
}
