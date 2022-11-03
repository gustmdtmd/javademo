package youtube;

abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	void stop() {

	}
}

class Marine extends Unit {
	@Override
	void move(int x, int y) {
		System.out.printf("Marine[x=%d, y=%d]\n", x, y);
	}
}

class Tank extends Unit {
	@Override
	void move(int x, int y) {
		System.out.printf("Tank[x=%d, y=%d]\n", x, y);
	}
}

class DropShip extends Unit {
	@Override
	void move(int x, int y) {
		System.out.printf("DropShip[x=%d, y=%d]\n", x, y);
	}
}

public class Chusang {

	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new DropShip()};
		
		group[0].move(100, 200);
		group[1].move(10, 250);
		group[2].move(175, 50);
		
		
	}

}
