package java010_abstract_interface.part04;

public interface CarRun {
	int carCount = 5;  //내부에서 public static final carCount = 5; 로 인식.
	//public CarRun() {} //생성자는 오류.
	//static {System.out.println("CarRun");} //static{} 오류.
	//void display() {} //추상메소드가 아니면 오류.	
	void prn(); //내부에서 abstract public void prn(); 로 인식.
	class Sun{ //public static class Sun
		public Sun() {
			System.out.println("Sun Const");
		}
	} //클래스 선언 가능.
}
