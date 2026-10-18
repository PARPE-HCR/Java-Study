package 개인연습;
import java.util.Scanner;
public class 재고관리_프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("===재고관리 시스템===");
		System.out.print("최대 상품 등록개수>>>");
		int size = scanner.nextInt();
		Inventory myMarket = new Inventory(size);
		myMarket.run();
	}
}

class Product{
	String name;
	int amount;
	public Product(String name,int amount) {
		this.name = name;
		this.amount = amount;
	}
}
class Inventory{
	Product[] products;
	public Inventory(int size) {
		products = new Product[size];
	}
	void addProduct(String name,int amount) {
		for(int i=0;i<products.length;i++) {
			if(products[i] == null) {
				products[i] = new Product(name,amount);
				return;
			}
		}
		System.out.println("상품을 더 이상 등록할 수 없습니다");
		return;	
	}
	void sellProduct(String name,int amount) {
		for(int i=0;i<products.length;i++) {
			if(products[i] != null && products[i].name.equals(name)) {
				if(products[i].amount >= amount) {
					products[i].amount -= amount;
					System.out.println("판매가 완료되었습니다");
					return;
				}
				else {
					System.out.print("재고가 부족합니다");
					return;
				}
			}
		}	
		System.out.println("상품을 찾을 수 없습니다.");
		return;
	}
	void removeProduct(String name) {
		for(int i=0;i<products.length;i++) {
			if(products[i] != null && products[i].name.equals(name)) {
				products[i] = null;
				System.out.println("상품이 삭제되었습니다");
				return;
			}
		}
	}
	void showProducts() {
		int total = 0;
		System.out.println("===상품목록===");
		for(int i=0;i<products.length;i++) {
			if(products[i] != null) {
				total += products[i].amount;
				System.out.printf("%s:%d개\n",products[i].name,products[i].amount);
			}
		}
		System.out.println("전체 재고수량:" + total);
		return;
	}
	void run() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.등록 2.판메 3.삭제 4.목록 5.종료");
			System.out.print("선택>>>");
			int menu = scanner.nextInt();
			scanner.nextLine();
			switch(menu) {
				case 1:{
					System.out.print("상품이름>>>");
					String name = scanner.nextLine();
					System.out.print("재고수량>>>");
					int amount = scanner.nextInt();
					addProduct(name,amount);
					break;
				}
				case 2:{
					System.out.print("판매할 상품>>>");
					String name = scanner.nextLine();
					System.out.print("판매수량>>>");
					int amount = scanner.nextInt();
					sellProduct(name,amount);
					break;
				}
				case 3:{
					System.out.print("삭제할 상품>>>");
					String name = scanner.nextLine();
					removeProduct(name);
					break;
				}
				case 4:{
					showProducts();
					break;
				}
				case 5:{
					System.out.print("시스템을 종료합니다");
					return;
				}
				default:{
					System.out.print("잘못된 입력입니다");
					break;
				}	
			}
		}
	}
}

 
