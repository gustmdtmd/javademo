package java011_casting.part04;

public class Java112_binding {

	//결합도가(의존도가) 낮아졌다. Java111_binding 연결되는 내용. 동적바인딩.
	public static void process(HomeTv htv) { //업캐스팅
		htv.turnOn();
		htv.soundUp();
		
		//부모클래스에 없고 각각의 자식클래스에만 있는 메소드출력시
		if(htv instanceof LgTv) { // 객체 타입 구분 : instanceof
			LgTv ltv = (LgTv)htv;  //다운캐스팅
			ltv.call();
		}else if(htv instanceof SamsungTv) {
			SamsungTv stv = (SamsungTv)htv; //다운캐스팅
			stv.move();
		}//if end
	}//process() end

	public static void main(String[] args) {
		LgTv lg = new LgTv("LG");
		process(lg);

		System.out.println();
		SamsungTv samsung = new SamsungTv("SAMSUNG");
		process(samsung);

	}// main() end

}// class end
