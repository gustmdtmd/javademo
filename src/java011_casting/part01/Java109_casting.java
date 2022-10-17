package java011_casting.part01;

/*
 * 객체형변환 - 참조데이터타입
 * 1. 상속관계일 때 형변환이 가능하다.(is a)
 * 2. 업캐스팅 발생된 후 다운캐스팅을 할 수 있다.
 *    -업캐스팅 (up-casting) : 부모객체로 자식객체를 참조하도록 형변환하는 기술
 *    -다운캐스팅(down-casting) : 업캐스팅을 다시 원상복귀해주는 형변환하는 기술
 */
public class Java109_casting {

	public static void main(String[] args) {
		//SampleA sa = new SampleA();
		//SampleB sb = new SampleB();
		//sa = (SampleA)sb; 오류.
		
		Parent p = new Parent();
		Child c = new Child();
		
		p=c; //업캐스팅(up-casting)
		p.process();
		//p.call(); 
		//오류. 부모클래스에 있는 메소드만 출력하는데 call은 자식클래스의 메소드이기때문에
		
		//다운캐스팅(down-casting)
		Child d = (Child)p;
		
		//부모클래스 변수 = new 자식클래스(); 
		//한번에 객체생성 및 업캐스팅
		Parent pt = new Child();
		pt.process();
		//pt.call();
		
		//다운캐스팅
		Child cn = (Child)pt;
		cn.call();
	}

}
