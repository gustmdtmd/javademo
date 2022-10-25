package ncs.test02;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double[] data = new double[5];
		double sum = 0;
		
		//str에서 데이터를 분리한다.
		String[] st = str.split(",");

		for(String sg : st) { //for~each문 사용한다.
			//배열에 실수 데이터를 넣는다.
			//배열 데이터의 합을 구한다.
			sum += Double.parseDouble(sg);
		}
		double avg = sum/st.length;
		
		System.out.printf("%.3f\n", sum);
		System.out.printf("%.3f\n", avg);
		//결과 값을 출력한다.
	}//end main()

}//end class
