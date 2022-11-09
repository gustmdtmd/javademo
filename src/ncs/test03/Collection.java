package ncs.test03;

import java.util.*;

public class Collection {

	public static void main(String[] args) {
		/*
		단일 데이터인 List와 Set의 공통부분을 모아서 Collection을 만듬
		1.List 순서가 있는 데이터의 집합, 데이터의 중복을 허용한다. ex) 대기자 명단
		  ArrayList, LinkedList, Vector
		2.Set 순서를 유지하지 않는 데이터의 집합. 데이터의 중복을 허용하지 않는다. ex) 양의정수집합
		  HashSet, TreeSet
		3.Map 키와 값의 쌍으로 이루어진 데이터의 집합
		      순서는 유지되지 않으며, 키는 중복을 허용하지 않고, 값은 중복을 허용한다. ex)우편번호, 지역번호
		  HashMap,TreeMap, HashTable
		*/
		
		/*
		  ArrayList 
		  1. 저장순서가 유지되고 중복이 허용된다.
		  2. 데이터의 저장공간으로 배열을 사용한다.
		  add, remove, indexOf/lastIndexOf, contains,get/set, subList, toArray()
		  inEmpty(),trimToSize(), size()
		  
		 
		   배열의 장단점
		   장점 - 배열은 구조가 간단하고 데이터를 읽는데 걸리는 시간이 짧다.
		   단점 - 크기를 변경할 수 없다. (크기를 변경해야 하는 경우 배열을 새로 만들어 데이터를 복사해야한다.)
		         비순차적인 데이터의 추가, 삭제에 시간이 많이 걸린다.
		         그러나 순차적인 데이터 추가(끝에 추가)와 삭제(끝부터 삭제)는 빠르다.
		         
		   LinkedList - 배열의 단점을 보완
		   -배열과 달리 링크드 리스트는 불연속적으로 존재하는 데이터를 연결(link)
		   -데이터 삭제 : 단 한 번의 참조변경으로 가능
		   -데이터 추가 : 한 번의 Node객체생성과 두 번의 참조변경만으로 가능
		   
		   LinkedList - 이중 연결 리스트
		   -링크드 리스트 : 연결리스트, 데이터 접근성이 나쁨 (단점) 
		   -더블리 링크드 리스트 : 이중연결리스트, 접근성 향상
		
	 	*/
		
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1, list2);
		
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0,"1");
		//list1.remove(1); //인덱스 1번째를 삭제
 		//list1.remove(new Integer(1)); //숫자 1을 삭제
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2) );
		print(list1, list2);
		
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
	}//end main
	
	public static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		System.out.println();
	}
}//end class
