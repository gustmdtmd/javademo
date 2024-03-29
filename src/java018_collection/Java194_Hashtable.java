package java018_collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;



/*
 * Hashtable
 * 1. Map인터페이스 구현해놓은 클래스
 * 2. Map인터페이스를 구현해놓은 클래스들은 key, value쌍으로 저장한다.
 * 3. value를 구현해주는 것은 key 이므로 key는 중복을 허용하지 않는다.
 */
public class Java194_Hashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(10, "java");
		table.put(20, "jsp");
		table.put(30, "spring");
		table.put(20, "mysql"); // key 값이 중복되면 나중값으로 출력된다.
		
		System.out.println(table.get(10));
		System.out.println(table.get(20));
		System.out.println(table.get(30));
		
		System.out.println("===Enumeration===");
		
		Enumeration<String> enu = table.elements(); //element는 value를 가져온다.
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		
		Enumeration<Integer> enuKey = table.keys();
		//key 가져오기
		while(enuKey.hasMoreElements()) {
			Integer key = enuKey.nextElement();
			System.out.printf("%d:%s \n", key, table.get(key));
		}
		
		System.out.println("=================================");
		Set<Integer> st = table.keySet();
		//for(Integer key : table.keySet())
		for(Integer key : st)
			System.out.printf("%d:%s\n", key, table.get(key));
	}//main() end

}//class end
