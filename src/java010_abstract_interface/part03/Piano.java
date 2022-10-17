package java010_abstract_interface.part03;

public class Piano extends Instrument {
	public Piano() {
	
	}
	
	public Piano(String piano) {
		super(piano);
	}
	
	@Override
	public void play() {
	System.out.println("손으로 친다.");	
	}
}
