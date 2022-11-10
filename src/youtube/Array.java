package youtube;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		/*
		   Arrays - 배열을 다루기 편리한 메서드 제공
		    1.배열의 출력 - toString()
		    2.배열의 복사 - copyOf(), copyOfRange() => 새로운 배열 생성반환
		     ex) int[] arr = {0,1,2,3,4};
		         int[] arr1 = Arrays.copyOf(arr, 5);
		         int[] arr1 = Arrays.copyOfRange(arr, 2,4);
		    3.배열 채우기 - fill(), setAll()
		      int[] arr = new int[5];
		      Arrays.fill(arr, 9);   //arr=[9,9,9,9,9]
		      Arrays.setAll(arr,(i) -> (int)(Math.random()*5)+1  //arr=[1,5,2,1,1]
		    4.배열의 정렬과 검색 - sort(), binarySearch()
		    binarySearch()는 꼭 정렬 후 검색해야한다.
		    5.다차원 배열의 출력 - deepToString()
		    6.다차원 배열의 비교 - deepEquals()
		    7.배열을 List로 변환 - asList(Object... a)
		 */
		
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13}, {21,22,23}};
		
		System.out.println("arr=" + Arrays.toString(arr));
		System.out.println("arr2D=" + Arrays.deepToString(arr2D));
		int[] arr3 = Arrays.copyOf(arr, 4);
		System.out.println("arr3=" + Arrays.toString(arr3));
		int[] arr4 = Arrays.copyOfRange(arr, 1, 4);
		System.out.println("arr4=" + Arrays.toString(arr4));
		
		int[] arr5 = new int[5];
		Arrays.fill(arr5, 15);
		System.out.println("arr5=" + Arrays.toString(arr5));
		
		String[][] str = new String[][] {{"aaa","bbb"}, {"AAA","BBB"}};
		String[][] str2 = new String[][] {{"aaa","bbb"}, {"AAA","BBB"}};
		
		//System.out.println(Arrays.equals(str,str2)); 다차원배열이기때문에 오류
		System.out.println(Arrays.deepEquals(str,str2)); 
		
		char[] charr = {'A','E', 'D', 'C', 'B'};
		
		System.out.println("charr="+Arrays.toString(charr));
		System.out.println("index of B=" + Arrays.binarySearch(charr, 'B'));
		Arrays.sort(charr);
		System.out.println("charr="+Arrays.toString(charr));
		System.out.println("index of B=" + Arrays.binarySearch(charr, 'B'));
		
		
	}

}
