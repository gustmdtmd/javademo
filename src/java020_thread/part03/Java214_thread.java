package java020_thread.part03;

public class Java214_thread {

	public static void main(String[] args) {
		LifeCycle cc = new LifeCycle();
		System.out.println(cc.getState()); // NEW
		
		cc.start(); // RUNNABLE
		
		try {
			//지정된 시간동안 스레드가 실행되도록 한다.
			//지정된 시간이 지나거나 종료가 되면 
			//join()을 호출한 스레드로 다시 돌아와 실행을 계속한다.
			cc.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(cc.getState());
		
		System.out.println("main end");
	}//end main()

}//end class
