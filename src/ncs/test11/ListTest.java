package ncs.test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random nan = new Random();
		
		for(int i=0; i<10; i++) {
			list.add(nan.nextInt(100)+1);
		}
		System.out.println(list);
		
		
	}//end main() 
	
	public void display(List list) {
		
	}//end display()
}//end class
