package ncs_start;

public class Product {
	public String name;
	public int price;
	public int quantity;

	public Product() {
	}

	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String information() {
		return toString().format("상품명: %s\n 가격: %d 원\n 수량: %d 개\n", name, price, quantity);
	}
}
