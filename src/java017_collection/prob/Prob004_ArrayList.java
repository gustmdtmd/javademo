package java017_collection.prob;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 2 
 * 10 
 * 4 
 * 6
 */
public class Prob004_ArrayList {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 3, 2, 7 };
		int[] num = { 1, 10, 15, 4, 6 };
		ArrayList<Integer> v = merge(arr, num);
		for (Integer it : v)
			System.out.println(it);
	}// end main()

	public static ArrayList<Integer> merge(int[] arr, int[] num) {
		// arr,num배열을 병합한후 2의 배수만 리턴하는 프로그램을 구현하시오.
		/*
		 * System.arraycopy(src, srcPos, dest, destPos, length); 
		 * Object src : 복사하고자 하는 소스입니다.
		 * 
		 * 원본이라고 생각하면 됩니다.
		 * 
		 * int srcPos : 위의 원본 소스에서 어느 부분부터 읽어올지 위치를 정해줍니다.
		 * 
		 * 처음부터 데이터를 읽어올거면 0 을 넣어줍니다.
		 * 
		 * Object dest : 복사할 소스입니다.
		 * 
		 * 복사하려는 대상입니다.
		 * 
		 * int destPos : 위의 복사본에서 자료를 받을 때, 어느 부분부터 쓸 것인지 시작 위치를 정해줍니다.
		 * 
		 * 처음부터 데이터를 쓸 거면 0 을 넣어줍니다.
		 * 
		 * int length : 원본에서 복사본으로 데이터를 읽어서 쓸 데이터 길이입니다.
		 * 
		 * 원본에서 복사본까지 얼마큼 읽어 올지 입력하는 것입니다.
		 */
		int[] data = new int[arr.length + num.length];
		System.arraycopy(arr, 0, data, 0, arr.length);
		System.arraycopy(num, 0, data, arr.length, num.length);
		ArrayList<Integer> aList = new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				aList.add(data[i]);
			}
		}

		return aList;

	}// end merge();

}
