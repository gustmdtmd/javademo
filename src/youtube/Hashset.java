package youtube;

import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		/*
		    HashSet - 순서 X 중복 X
		     -Set인터페이스를 구현한 대표적인 컬렉션 클래스
		     -순서를 유지하려면 LinkedHashSet클래스를 사용하면 된다. 
		    
		*/
		
		Object[] objArr = {"1", new Integer(1), '1', "2", "2", "3", "3","4","4"};
		Set set = new HashSet();
		
		//set에 objArr 저장, 순서와 중복 X
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		//HashSet에 저장된 요소들을 출력한다.
		System.out.println(set);
		
		//HashSet에 저장된 요소들을 출력한다.(Iterator 이용)
		Iterator it = set.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
		
		Set sett = new HashSet();
		
		for(int i=0; sett.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			sett.add(num);
		}
		
		List list = new LinkedList(sett);
		Collections.sort(list);
		System.out.println(list);
	}

}
