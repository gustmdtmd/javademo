package ncs.test09;

public class PlaneTest {

	public static void main(String[] args) {
		Airplane ap = new Airplane("L747", 1000);
		Cargoplane cp = new Cargoplane("C40", 1000);
		
		ap.flight(100);
	}//end main()

}//end class
