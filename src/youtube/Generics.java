package youtube;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		/*
		   지네릭스
		    -컴파일시 타입을 체크해주는 기능
		    -객체의 타입 안전성을 높이고 형변환의 버거로움을 줄여줌.
		   
		   제네릭스 사용시 장점
		    -타입의 안정성을 제공한다.
		    -타입체크와 형변환을 생략할 수 있으므로 코드가 간결해진다.
		*/
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		//list.add("30"); //오류
		list.add(30);
		
//		Integer i =(Integer)list.get(2); //컴파일 ok 그러나 실행시 오류
		
		System.out.println(list);
	}//end main()
	
}//end class
