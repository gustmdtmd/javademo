package youtube;

class Product {
	int price;
	int bonusPoint;

	public Product() {

	}

	public Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "Tv";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Product[] cart = new Product[10];
	
	int i=0;
	
	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString() + "을/를 구입하셨습니다.");
		cart[i++] = p;
	}
	
	void summary() {
		int sum =0;;
		String itemList = "";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
			itemList += cart[i].toString();
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
public class buy {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		
		//Product p = new Tv();
		//b.buy(p);
		b.buy(new Tv());
		b.buy(new Computer());
		b.summary();
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
		System.out.println("적립포인트는 " + b.bonusPoint + "포인트 입니다.");
	}
}
