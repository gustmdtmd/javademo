package java008_static_access.prob.part02;

/*
 * 품목 : apple 수량 : 5 단가 : 1200원 금액 : 6000원
 *
 * apple 1200원 짜리 5개 구입하면 6000원이 필요함
 */

public class Prob02_class {
	public static void main(String[] args) {
		Sales ss = new Sales();
		// 테스트를 할때는 아래 주석을 해제하세요.

		ss.setItem("apple");
		ss.setQty(5);
		ss.setCost(1200);

		System.out.println(ss.toString());

		System.out.printf("%s %d원 짜리 %d개 구입하면 %d원이 필요함.", ss.getItem(), ss.getCost(), ss.getQty(), ss.getPrice());

	}// end main()
}// end class Prob02_class
