package java007_class.part06;

public class Java079_class {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addValue(4, 8);
		//void addValue(int x, int y) 없을시
		//자동형변환되어 void addValue(double x, double y)로 실행된다.
		
		cal.addValue(4, 8, 12);
		
		cal.addValue(4.0, 8.0);
		//void addValue(double x, double y) 없을시
	    //int로 자동형변환되지않아 실행이 안된다.

	}//main() end

}//class end
