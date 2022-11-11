package youtube;

public class Annotation {

	public static void main(String[] args) {
		/*
		    애너테이션
		     -주석처럼 프로그래밍 언어에 영향을 미치지 않으며, 유용한 정보를 제공
		     
		    표준 애너테이션
		     -java에서 제공하는 애너테이션
		      1. @Override
		       -오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
		       -오버라이딩할 때 메서드이름을 잘못적는 실수를 하는 경우가 많다.
		       -오버라딩할때는 메서드 선언부 앞에 @Override를 붙이자.
		      2.@Deprecated
		       -앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.
		       -@Deprecated가 붙은 대상이 사용된 코드를 컴파일하면 나타나는 메세지는 오류는 아니나 경고
		      3.@Functionallnterface
		       -함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
		       -함수형 인터페이스에는 하나의 추상메서드만 가져야 한다는 제약이 있음
		      4.@SupprssWarnings
		       -컴파일러의 경고메세지가 나타나지 않게 억제한다.
		       -괄호()안에 억제하고자하는 경고의 종류를 문자열로 지정
		     
		    메타 애너테이션
		     -메타 애너테이션은 '애너테이션을 위한 애너테이션'
		     -메타 애너테이션은 java.lang.annotation패키지에 포함
		      1.@Target
		       -애너테이션을 정의할 때, 적용대상 지정에 사용
		      2.@Retention
		       -애너테이션이 유지되는 기간을 지정하는데 사용
		         source - 소스파일에만 존재, 클래스파일에는 존재하지 않음.
		         class - 클래스파일에 존재, 실행시에 사용불가. 기본값
		         runtime - 클래스 파일에 존재, 실행시에 사용가능
		       -컴파일러에 의해 사용되는 애너테이션의 유지 정책은 source이다.
		       -실행시에 사용 가능한 애너테이션의 정책은 runtime이다.
		      3.@Documented, @Inherited
		      4.@Repeatable
		       -반복해서 붙일 수 있는 애너테이션을 정의할 때 사용
		       
		     애너테이션 타입 정의하기
		      -애너테이션을 직접 만들어 쓸 수 있다.
		       @interface 애너테이션 이름 {
		           타입 요소이름();
		       }
		      -애너테이션의 메서드는 추상 메서드이며, 애너테이션을 적용할 때 지정(순서X)
		     
		     애너테이션의 요소
		      -적용시 값을 지정하지 않으면, 사용될 수 있는 기본갑 지정 가능(null제외)
		      -요소가 하나이고 이름이 value일 때는 요소의 이름 생략가능
		      -요소의 타입이 배열인 경우, 괄호{}를 사용해야한다.
		     
		     모든 애너테이션의 조상
		      -Annotation은 모든 애너테이션의 조상이지만 상속은 불가
		      -사실 Annotation은 인터페이스이다.
		     
		     마커 애너테이션
		      -요소가 하나도 정의되지 않은 애너테이션
		     
		     애너테이션 요소의 규칙
		      -애너테이션의 요소르 선언할 때 아래의 규칙을 반드시 지켜야한다.
		        요소의 타입은 기본형, String, enum, 애너테이션, Class만 허용됨
		        괄호()안에 매개변수를 선언할 수 없다.
		        예외를 선언할 수 없다.
		        요소를 타입 매개변수를 정의할 수 없다.
		*/
		
	}

}
