package java008_static_access.part01;

/*
 * static
 * 1. class loader일때 method area에 저장이 된다.
 * 2. 같은 클래스로 생성된 객체끼리 공유해서 사용한다.
 * 3. static키워드가 선언된 메소드에서 this, super키워드를 사용할 수 없다.
 *    => static 클래스 소속인데 인스턴스 변수인 instanceVar에 접근 하려면 
 *       어떤 인스턴스의 instanceVar인지 알수 있어야 하는데 모르기 때문에
 */
public class Java083_static {

	public static void main(String[] args) {
		System.out.printf("StaticEx.y=%d\n", StaticEx.y);
		//System.out.printf("StaticEx.y=%d\n", StaticEx.x); 오류.
		
		StaticEx se = new StaticEx();
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);
		
		StaticEx ss = new StaticEx();
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y);
		
		se.x= 20;
		se.y= 30;
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y);
		
		//주소값이 같다.
		System.out.println(se.y == ss.y);
		
	}// main() end

}// class end
