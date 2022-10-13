package java008_static_access.part07;

public class MemberDAO {
	private static MemberDAO dao = new MemberDAO();
	private MemberDAO() {
		
	}
	
	public static MemberDAO getInstance() {
		return dao;
		//return new MemberDAO();
		//=> 싱글톤패턴이 아니다. new 생성하기때문에 주소값이 달라진다
	}
	
	public void display() {
		System.out.println("display");
	}
}
