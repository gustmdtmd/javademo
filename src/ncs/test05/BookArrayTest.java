package ncs.test05;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] bArray = new Book[3];
		//Book객체를 3개 생성하여 배열에 넣는다.
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도움출판", 0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);
		//배열에 있는 객체 정보를 모두 getter로 출력한다.
		//실행결과와 같이 계산출력
		int sale = 0;
		for(Book arr : bArray) {
			 sale += arr.getPrice()-(int)(arr.getPrice()*arr.getDiscountRate()); 
			 System.out.printf("%s,%s,%d원,%s,%.0f%%할인\n", 
						arr.getTitle(), arr.getAuthor(), arr.getPrice(), arr.getPublisher(), arr.getDiscountRate()*100);
				System.out.printf("할인된 가격 : %d 원\n",sale);
				sale=0;
		}
		
		
		
	}//end main()

}//end class
