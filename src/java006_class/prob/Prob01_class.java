package java006_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */
class Java{
	String name;
	int r;
	
	
	public double area() {
	return r*r*3.14;
	}
	
//	public Java(String name, int r) {
//		this.name = name;
//		this.r = r;
//	}
//	
//	public void display() {
//		System.out.printf("자바%s의 면적은 %.1f\n", name, area());
//	}
}
public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////	
//		Java pizza = new Java("피자", 10);
//		pizza.area();
//		
//		Java donut = new Java("도넛", 2);
//		donut.area();
		
		Java pizza = new Java();
		pizza.name = "자바피자";
		pizza.r = 10;
		
		Java donut = new Java();
		donut.name = "자바도넛";
		donut.r = 2;
		
		System.out.printf("%s의 면적은 %.1f\n", pizza.name, pizza.area());
		System.out.printf("%s의 면적은 %.1f\n", donut.name, donut.area());
		
	}//end main()

}//end class
