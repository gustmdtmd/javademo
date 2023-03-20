package ncs_start;

public class StringTest {
	
	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		int cnt=0;
		
		String[] st = str.split(",");
		
		for(String ss : st) {
			data[cnt] = Double.parseDouble(ss);
			sum += data[cnt];
			cnt++;
		}
		
		System.out.printf("합계: %.3f\n" , sum);
		System.out.printf("평균: %.3f" , sum/cnt);
	}
}
