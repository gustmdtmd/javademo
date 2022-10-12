package java006_class.part01;

public class Java066_class {

	public static void main(String[] args) {
		Person ps; //객체참조변수 선언 - stack ps안에 비어 있음
		ps = new Person(); //객체 생성 - 주소값을 가져옴
		ps.name = "홍길동";
		ps.age = 30;
		ps.gender = '남';
		System.out.printf("%s %d %c\n",ps.name, ps.age, ps.gender);
		
		ps.develop();
		ps.run(10); // class에서 매개변수가 있을경우 값을 넣어주어야한다.

		System.out.printf("\n");
		
		Person pn = new Person(); //객체참조변수 및 객체생성
		pn.name = "김영희";
		pn.age = 28;
		pn.gender = '여';
		System.out.printf("%s %d %c\n",pn.name, pn.age, pn.gender);
		
		pn.develop();
		pn.run(20);
		
	}//main() end

}//class end
