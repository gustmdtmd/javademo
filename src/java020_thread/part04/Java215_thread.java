package java020_thread.part04;

/*
 * 스레드의 우선순위는 1 ~ 10 까지 지정할 수 있다.
 * 스레드의 기본값은 5이다.
 * Thread.MAX_PRIORITY = 10
 * Thread.NORM_PRIORITY = 5
 * Thread.MIN_PRIORITY = 1
 */
public class Java215_thread {

	public static void main(String[] args) {
		PriorityTest t1 = new PriorityTest();
		t1.start();
		
		PriorityTest t2 = new PriorityTest();
		//t2.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(10); // thread 우선순위 설정 
		t2.start();
		
		PriorityTest t3 = new PriorityTest();
		t3.setPriority(3);
		t3.start();
		
		PriorityTest t4 = new PriorityTest();
		// thread 우선순위 미설정 시 5로 적용 
		t4.setName("User"); // thread 이름 설정
		t4.start();
		
		PriorityTest t5 = new PriorityTest();
		t5.setPriority(7);
		t5.setName("Test");
		t5.start();
	}//end main()

}//end class
