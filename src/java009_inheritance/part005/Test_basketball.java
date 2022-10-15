package java009_inheritance.part005;

/*
 * 문제) 
 * 농구 3점과 2점을 각각 10번씩 던져 기록에 따른 점수와 100m달리기 기록의에 따른 점수의 합으로 등급을 구하는 프로그램작성.
 * 3점 : 3*넣은 수
 * 2점 : 2*넣은 수
 * 
 * 100m달리기  
 * 11초미만 50점, 11초이상 12초미만 40점, 12초이상 13초미만 30점, 13초이상 14초미만 20점, 14초 이상 20미만 10점, 20초이상은 0점.
 * 
 * 
 * Score 클래스 안에 아래 사항을 추가합니다.
 * 1. 점수 계산하는 메소드를 정의한다.
 * 2. 등급 계산하는 메소드를 정의한다.
 *     3점과 2점 50점 만점, 100m달리기 50점 만점으로 합이 100점
 *     100점~90점 'A', 90~80 'B', 80~70 'C', 70~60 'D', 60 이하 'F' 
 * 3. res() 오버라이딩 한다.
 * 
 *   [출력결과]
 *    홍길동님은 3점 6개 , 2점 7개로 총 합 64점으로 'D'등급입니다.
 *    이순신님은 3점 9개 , 2점 10개로 총 합 94점으로 'A'등급입니다.
 */
public class Test_basketball {
	
	public static void main(String[] args) {
		Running[] running = new Running[3];
		running[0] = new Running("홍길동", 6, 8, 12.48);
		running[1] = new Running("이순신", 9, 10, 10.82);
		running[2] = new Running("박태환", 3, 6, 15.71);
		
		running[0].res();
		running[1].res();
		running[2].res();


	}

}
