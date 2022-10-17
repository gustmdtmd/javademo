package java011_casting.part03;


public class Java111_binding {

	public static void main(String[] args) {
		LgTv lg = new LgTv("LG");
		process(lg);
		
		SamsungTv samsung = new SamsungTv("SAMSUNG");
		process(samsung);
		
	}//main() end
	
	//결합도가(의존성이) 높다 - 유지보수가 높고 확장성이 약하다.
	public static void process(SamsungTv tv) {
		tv.turnOff();
		tv.turnOn();
		tv.soundDown();
		tv.soundUp();
		tv.move();
	}//process() end
	
	public static void process(LgTv tv) {
		tv.turnOff();
		tv.turnOn();
		tv.soundDown();
		tv.soundUp();
		tv.call();
	}//process() end
	
}//class end
