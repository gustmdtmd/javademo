package java008_static_access.part03;

public class Java085_static {
	int x=4; // heap에 생성
	static int y=5; 
	public static void main(String[] args) {
		//System.out.printf("x=%d\n", x); //오류. non-static
		System.out.printf("y=%d\n", y);
		//process(); //non-static
		display();   //static
		Java085_static js = new Java085_static();
		js.process();
		
	}//main() end

	//non-static => 객체생성 후 선언가능
	public void process() {
		System.out.printf("x=%d\n", x); //heap에 생성되기때문에 호출가능
		System.out.println("process");
		display(); //non-static 메소드에서 static메소드 호출 가능
	}//process() end
	
	//static => 객체생성 없이 선언가능
	public static void display() {
		System.out.println("display");
	}//display() end
	
}//class end
