package java017_collection;

import java.util.ArrayList;

public class Java185_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
		process(aList);
	}//main() end
	
	public static void prnDisplay(ArrayList<String> aList) {
		//aList 매개변수의 요소에서 'J' or 'j'가 포함되어 있는 요소만
		//출력하는 프로그램을 구현하세요.
		for(String sn : aList) {
			if(sn.toLowerCase().contains("j"))
				System.out.println(sn);
		}//for end
	}//prnDisplay() end
	
	public static void process(ArrayList<String> aList) {
		System.out.println(aList.contains("jsp"));
	}
}//class end
