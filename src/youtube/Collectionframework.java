package youtube;

import java.util.*;


public class Collectionframework {

	public static void main(String[] args) {
		/*
		   Iterator
		    -컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것.
		    -hasNext() : 읽어올 요소가 남았는지 확인하는것.
		    -next() : 다음 요소를 읽어옴.
		    
		   Map과 iterator
		   -Map은 iterator()가 없다. keySet(), entrySet(), values()를 호출해야함.
		*/
		
		//List list = new ArrayList();
		//Collection list = new  TreeSet();
		//Collection list = new  ArrayList();
		Collection list = new  HashSet();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		//Iterator은 일회성
		Iterator it1 = list.iterator();
		
		while(it1.hasNext()) {
			Object obj = it1.next();
			System.out.println(obj);
		}
		
		
	}

}
