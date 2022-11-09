package youtube;

import java.util.*;

public class Stack_queue {

	public static void main(String[] args) {
		/*
		   스택(stack) : LIFO 구조. 마지막에 저장된것을 제일 먼저 꺼내게 된다.
		               저장(push), 추출(pop)
		               배열로 구현
		   큐(Queue) : FIFO 구조. 제일 먼저 저장한 것을 먼저 꺼낸게 된다.
		   	          저장(offer), 추출(poll) 
		   	          링크드리스트로 구현
		   	          큐는 인터페이스이다
		   	           -큐를 직접구현
		   	           -큐를 구현한 클래스를 사용
		*/
		
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("Stack = ");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("Queue = ");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		}

}
