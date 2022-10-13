package java008_static_access.part05;
//import - 패키지가 다른경우 입력해주어야한다.
public class Java088_access {

	public static void main(String[] args) {
		Java087_access p = new Java087_access();
		//System.out.printf("p.var_private=%d\n",p.var_private); 오류.
		// => private는 선언한 클래스 외에는 공유가 안된다.
		System.out.printf("p.var_default=%d\n",p.var_default);
		System.out.printf("p.var_protected=%d\n",p.var_protected);
		System.out.printf("p.var_public=%d\n", p.var_public);
		
	}//main() end

}//class end
