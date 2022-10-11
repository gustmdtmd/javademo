package java005_method;

public class Java056_method {

	public static void main(String[] args) {
		
		int a = 4, b = 2, c = 5;
		System.out.println(process(a, b, c));
		//System.out.println(process2(a, b, c));
		
		int[] num = new int[] {10,20,30,40,50};
		int[] data = new int[] {5,6,7,8};
		System.out.println(plus(num));
		System.out.println(plus(data));
	}// main() end

	
	public static int process(int x, int y, int z) {
		return x + y + z;
	}// process() end
	
//	public static void process2(int x, int y, int z) {
//		System.out.println(x+y+z);
//	}// process2() end
	
	public static int plus(int[] arr) { //배열의 데이터타입은 꼭 맞추어야한다.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}// plus() end 
	
}// class end
