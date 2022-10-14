package java009_inheritance.part005;

/*
 * 문제) 
 * 농구 3점과 2점을 각각 10번씩 던져서 총합에 따른 등급을 구하는 프로그램작성.
 * 3점 : 6*넣은 수
 * 2점 : 4*넣은 수 
 * 
 * Score 클래스 안에 아래 사항을 추가합니다.
 * 1. 점수 계산하는 메소드를 정의한다.
 * 2. 등급 계산하는 메소드를 정의한다.
 * 100점~90점 'A', 90~80 'B', 80~70 'C', 70~60 'D', 60 이하 'F'
 * 
 *   출력결과
 *    홍길동님은 3점 6개 , 2점 7개로 총 합 64점으로 'D'등급입니다.
 *    이순신님은 3점 9개 , 2점 10개로 총 합 94점으로 'A'등급입니다.
 */
public class Java_prob {

	public static void main(String[] args) {
		Score[] score = new Score[2];
		score[0] = new Score("홍길동", 6, 7);
		score[1] = new Score("이순신", 9, 10);
		
		score[0].res();
		score[1].res();

	}

}
