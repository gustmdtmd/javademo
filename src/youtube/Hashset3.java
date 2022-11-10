package youtube;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset3 {

	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		HashSet set2 = new HashSet();
		HashSet setkyo = new HashSet();
		HashSet setcha = new HashSet();
		HashSet sethap = new HashSet();

		set1.add(1); set1.add(2); set1.add(3);
		set1.add(4); set1.add(5);
		System.out.println("set1:" + set1);

		set2.add(4); set2.add(5); set2.add(6);
		set2.add(7); set2.add(8);
		System.out.println("set2:" + set2);
		
		//교집합
		//set1.retainAll(set2);
		//합집합
		//set1.addAll(set2);
		//차집합
		//set1.removeAll(set2);
		//System.out.println(set1);
	
		Iterator it = set2.iterator();
		while(it.hasNext()) {
		Object tmp = it.next();
		if(set1.contains(tmp))
			setkyo.add(tmp);
		}
		
		
		it= set1.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!set2.contains(tmp))
				setcha.add(tmp);
		}
		
		it= set1.iterator();
		while(it.hasNext())
			sethap.add(it.next());

		it= set2.iterator();
		while(it.hasNext())
			sethap.add(it.next());
		
		System.out.println("set1 ∩ set2 = " + setkyo);
		System.out.println("set1 ∪ set2 = " + sethap);
		System.out.println("set1 - set2 = " + setcha);
	}

}
