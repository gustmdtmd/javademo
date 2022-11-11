package youtube;

public class Wildcard {

	public static void main(String[] args) {
		/*
		   와일드카드 <?>
		    -하나의 참조 변수로 대입된 타입이 다른 객체를 참조 가능
		     <? extends T> 와일드 카드의 상한 제함. T와 그 자손들만 가능
		     <? super T> 와일드 카드의 하한 제함. T와 그 조상들만 가능
		     <?> 제한 없음. 모드 타입이 가능. <? extends Object>와 동일 
		    -메서드의 매개변수에 와일드 카드를 사용
		    
		   지네릭 메서드
		    -제네릭 타입이 선언된 메서드(타입 변수는 메서드 내에서만 유효)
		    -클래스의 타입 매개변수<T>와 메서드의 타입 매개변수 <T>는 별개
		    -메서드를 호출할 때마다 타입을 대입해야(대부분 생략 가능)
		    -메서드를 호출할 때 타입을 생략하지 않을 때는 클래스 이름 생략 불가.
		   ex) Box<Object> obj = null;
		       Box box = (Box)obj;                 //가능하나 경고
		       Box<Object> obj = (Box<Object>) box //가능하나 경고
		   
		   
		   지네릭 타입의 형변환
		    -지네릭 타입의 형변환과 타입 간의 형변환은 바람직하지 않다.(경고발생)
		    -와일드 카드가 사용된 지네릭 타입으로는 형변환 가능
		    ex) FruitBox<? extends Fruit> fbox = new FruitBox<Fruit>();
		    FruitBox<? extends Fruit> abox = new FruitBox<Apple>(); //가능
		    FruitBox<Apple> appleBox = abox(); //가능
		    
		   지네릭 타입의 제거
		    -컴파일러는 지네릭 타입을 제거하고, 필요한 곳에서 형변환을 넣는다.
		     1.지네릭 타입의 경계를 제거  <T> -> Object
		     2.지네릭 타입 제거 후에 타입이 불일치하면, 형변환을 추가
		     3.와일드 카드가 포함된 경우, 적절한 타입으로 형변환 추가
		     
		*/
		
		

	}

}
