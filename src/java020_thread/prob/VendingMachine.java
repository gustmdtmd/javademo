package java020_thread.prob;

public class VendingMachine {

	public VendingMachine() {

	}

	public String getDrink() {

		return null;
	}

	public void putDrink(String drink) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%s : 음료수 No. %d 자판기에 넣기\n", Thread.currentThread().getName(), i);
		}
	}
}
