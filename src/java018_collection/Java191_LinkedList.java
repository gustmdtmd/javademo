package java018_collection;

import java.util.LinkedList;

/*
 * Queue(큐)
 * 1. FIFO(First in First Out) : 제일 먼저 저장한 요소를
 * 							제일 먼저 꺼내온다.
 * 2. 최근사용문서, 인쇄작업대기 목록, 버퍼
 */
public class Java191_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();
		
		//append
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		
		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll());
		
		
	}//main() end

}//class end
