package ncs_start;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("상품명: ");
		String name = scan.nextLine();
		System.out.println("가격: ");
		int price = scan.nextInt();
		System.out.println("수량: ");
		int quantity = scan.nextInt();
		scan.close();
		
		Product pd = new Product(name, price, quantity);
		System.out.println("총 구매 가격: "+pd.getPrice()*pd.getQuantity());
	}
}
