package java003_statements;

/*
 * 1~10까지 짝수, 홀수 누적을 계산하는 프로그램
 * 
 * [출력결과]
 * 홀수누적:25
 * 짝수누적:30
 */
public class Java029_for {

	public static void main(String[] args) {
		int odd = 0; // 홀수
		int even = 0; // 짝수

		for (int i = 1; i <= 10; i++) {
			// i변수의 값이 홀수이면
			if (i % 2 != 0) {
				odd += i;
			} else {
				even += i;
			}//if end

			 // i변수의 값이 짝수이면 
			 // if (i % 2 == 0) { 
			 //   even += i; 
			 // } else { 
			 //    odd += i; 
			 // } if end
			
		} // for end
		System.out.printf("홀수누적 : %d\n", odd);
		System.out.printf("짝수누적 : %d\n", even);

	}// main() end

}
