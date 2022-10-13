package java008_static_access.part06;

import java008_static_access.part05.Java087_access;
//다른 패키지에서 선언한 값을 공유할 경우 import를 선언해주어야한다.

/*
 * 클래스 관계
 * 1. has a : 포함관계
 * 2. is a : 상속관계
 * 
 */
public class Java089_access extends Java087_access{

	public static void main(String[] args) {
		//Java087_access p = new Java087_access();
		Java089_access p = new Java089_access();
		//System.out.printf("p.var_private=%d\n",p.var_private); 오류.
		// => private는 선언한 클래스 외에는 공유가 안된다.
		//System.out.printf("p.var_default=%d\n",p.var_default); 오류.
		System.out.printf("p.var_protected=%d\n",p.var_protected);
		System.out.printf("p.var_public=%d\n", p.var_public);

	}//main() end

}//class end
