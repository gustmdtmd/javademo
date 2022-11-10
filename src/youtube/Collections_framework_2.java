package youtube;

import java.util.Arrays;
import java.util.Comparator;

public class Collections_framework_2 {

	public static void main(String[] args) {
		/*
		   -객체 정렬에 필요한 메서드를 정의한 인터페이스
		   Comparable 기본정렬기준을 구현하는데 사용
		   Comparator 기본정렬기준 외에 다른 기준으로 정렬하고자할 때 사용
		   
		   -compare()와 compareTo()는 두 객체의 비교결과를 반환하도록 작성
		   		같으면 0, 오른쪽이 크면 음수(-), 왼쪽이 크면 양수(+)
		 */

		String[] strArr = {"cat", "lion", "tiger", "Dog"};
		
		Arrays.sort(strArr);
		System.out.println("strArr=" + Arrays.toString(strArr));
		

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
	
}


class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2)*-1; //-1을 곱해서 기본정렬방식의 역으로 변경한다.
			//return c2.compareTo(c1)	   //또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.
		}
		return -1;
	}
}