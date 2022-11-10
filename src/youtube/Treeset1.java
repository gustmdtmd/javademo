package youtube;

import java.util.*;

public class Treeset1 {

	public static void main(String[] args) {
		/*
		   TreeSet - 범위탐색, 정렬
		    -이진 탐색 트리로 구현 . 범위 탐색과 정렬에 유리
		    -이진 트리는 모든 노드가 최대 2개의 하위 노드를 갖음
		     각 요소(node)가 나무형태로 연결(LinkedList의 변형)
		     
		   이진 탐색 틜
		    -부모보다 작은 값은 왼쪽 큰 값은 오른쪽애 저장
		    -데이터가 많아질수록 추가, 삭제에 시간이 더 걸림 (비교횟수증가) - 단점
		   
		   TreeSet - 데이터 저장 과정 boolean add(Object o)
		*/

		Set set = new TreeSet(); //정렬이 된다.
		//Set set = new HashSet(); //정렬 X
		 
		for(int i = 0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		
		System.out.println(set);
		
		TreeSet sett = new TreeSet();
		int[] list = {50,66,30,20,15,80,55,99,100,2,11,25};
		
		for(int i = 0; i<list.length; i++)
			sett.add(list[i]);
		
		System.out.println("50보다 작은 값 : " + sett.headSet(50));
		System.out.println("50보다 큰 값 : " + sett.tailSet(50));
		System.out.println("30과 80사이 값 : " + sett.subSet(30, 80));
		
	}

}
