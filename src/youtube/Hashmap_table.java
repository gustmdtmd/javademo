package youtube;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Hashmap_table {

	public static void main(String[] args) {
		/*
		   HashMap과 Hashtabel - 순서 X 중복(키 X, 값 O)
		    -Map인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장
		    -HashMap(동기화X)은 Hashtable(동기화O)의 신버전
		    
		   HashMap
		    -Map인터페이스를 구현한 대표적인 컬렉션 클래스
		    -순서를 유지하려면, LinkedHashMap클래스를 사용하면 된다.
		   TreeMap
		    -범위 검색과 정렬에 유리한 컬렉션 클래스
		    -HashMap보다 데이터추가, 삭제에 시간이 더 걸림.
		   
		   HashMap의 키와 값
		    -해싱(hashing)기법으로 데이터를 저장. 데이터가 많아도 검색이 빠르다.
		    -Map인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장
		     키 => 컬렉션내의 키 중에서 유일해야한다. 중복X
		     값 => 키와 달리 중복가능.
		   
		   해싱(hashing)
		    -해싱함수로 해시테이블에 데이터를 저장, 검색
		    -해시테이블에 저장된 데이터를 가져오는 과정
		     1.키로 해시함수를 호출해서 해시코드를 얻는다.
		     2.해시코드에 대응하는 링크드리스트를 배열에서 찾는다.
		     3.링크드리스트에서 키와 일치하는 데이터를 찾는다.
		*/
		
		HashMap map = new HashMap();
		map.put("abcd", "1234");
		map.put("qwer", "1111");
		map.put("zxcv", "1234");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.println("id : ");
			String id = sc.nextLine().trim();
			
			System.out.println("password : ");
			String password = sc.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(!(map.get(id).equals(password))) {
				System.out.println("입력하신 비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			}else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
		

	}

}
