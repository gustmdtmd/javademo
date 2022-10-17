package java010_abstract_interface.part02;

public class Rect extends Shape {

	public Rect() {

	}

	public Rect(int width, int hegiht) {
		super(width, hegiht);
	}

	@Override
	double getArea() {
		return getHeight() * getWidth();
	}
}
