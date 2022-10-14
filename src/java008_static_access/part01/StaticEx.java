package java008_static_access.part01;

public class StaticEx {
	int x = 5; //힙영역에 생성
	static int y =10; //메소드영역에 생성, 클래스를 이용하여 사용가능
	
	public StaticEx() {
		
	}
	
	public String toString() {
		return String.format("x=%2d y=%2d\n", x, y);
	}
}// class end
