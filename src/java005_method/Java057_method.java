package java005_method;

public class Java057_method {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int c = a, d = b;  //값에 의한 복사(call by value)
		
		//c, d변수의 값을 교환
		int temp = c;
		c = d;
		d = temp;
		
		System.out.printf("a=%d, b=%d\n", a, b);
		System.out.printf("c=%d, d=%d\n", c, d);
		
		System.out.println("=================================");
		int[] num = new int[] {10,20};
		int[] arr = num; //주소에 의한 복사(call by reference)

		//arr[0], arr[1]을 값을 교환
		int imis = arr[0];
		arr[0] = arr[1];
		arr[1] = imis;
		
		//주소를 복사했을 때 값을 변경하면 대입해준 값도 바뀐다.
		System.out.printf("num[0]=%d, num[1]=%d\n", num[0], num[1]);
		System.out.printf("arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
		
	}//main() end

}//class end
