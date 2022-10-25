package ncs.test14;

import java.io.BufferedReader;
import java.util.Scanner;

public class GoodTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		Goods good = new Goods("인텔코어 i6", 229500, 3);
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("다음 항목의 값을 입력하시오.");
			String data = sc.nextLine();
			System.out.printf("책이름 : %s\n",good.getName());
			System.out.printf("책저자 : %s\n",good.getPrice());
			System.out.printf("페이지 : %d\n",good.getQuantity());
			System.out.println("입력된 결과는 다음과 같습니다.");
			System.out.printf("%s,%d 원,%d 개\n", good.getName(), good.getPrice(),good.getQuantity());
			System.out.printf("총 구매 가격 : %s 원", good.getPrice()*good.getQuantity());
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}//end main()

}//class end
