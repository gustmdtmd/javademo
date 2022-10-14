package java009_inheritance.part09;

public class HandPhone {
	private String maker; // 제품회사명 samsung, iphone, lg, saomi
	private String model; // 모델명
	private int price;
	
	public HandPhone() {
	
	}

	public HandPhone(String maker, String model, int price) {
		this.maker = maker;
		this.model = model;
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return String.format("%-4s %-10s %6d", maker, model, price);
	}
	
}
