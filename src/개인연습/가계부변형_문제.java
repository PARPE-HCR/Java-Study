package 개인연습;
import java.util.Scanner;
public class 가계부변형_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("가계부에 오신 것을 환영합니다");
		System.out.print("가계부크기 입력>>>");
		int size = scanner.nextInt();
		AccountBook mybook = new AccountBook(size); //mybook이라는 새로운 객체 생성
		mybook.run();
	}

}
class AccountItem {
	String name;
	int value;
		public AccountItem(String name,int value) {
			this.name = name;
			this.value = value;
		}
}
class AccountBook {
	AccountItem[] items;	//items는 배열
	int balance = 100000;
		public AccountBook(int size) {
			items = new AccountItem[size];
		}
		public void addBook(String item,int amount) {
			for(int i=0;i<items.length;i++) {
				if(items[i] == null) {
					items[i] = new AccountItem(item,amount);//함수를 불러오는것이므로 변수 제거하고 내용만 삽입
					balance += amount;
					return;
				}
			}
		}
		public int removeBook(String item) {
			for(int j=0;j<items.length;j++) {
				if(items[j] != null && items[j].name.equals(item)) {
					int value = items[j].value;
					items[j] = null;
					return value;
				}
			}
			System.out.println("내역을 찾지못했습니다");
			return 0;
		}
		public void showBook() {
			for(int k=0;k<items.length;k++) {
				if(items[k] != null) {
					System.out.printf("%s:%d원\n",items[k].name,items[k].value);
				}
			}
			System.out.println("현재 잔액:"+ balance + "원");
		}
		public void run() {
			Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.print("가계부:1=수입,2=지출,3=삭제,4=출력,5=종료>>");
				int menu = scanner.nextInt();
				scanner.nextLine();
				switch(menu) {
					case 1:{
						System.out.print("수입내역>>");
						String inven  = scanner.nextLine();
						scanner.nextLine();
						System.out.print("수입금액>>");
						int price = scanner.nextInt();
						addBook(inven,price);
						break;
					}
					case 2:{
						System.out.print("지출내역>>");
						String inven  = scanner.nextLine();
						scanner.nextLine();
						System.out.print("지출금액>>");
						int price = -scanner.nextInt();
						addBook(inven,price);
						break;
					}
					case 3:{
						System.out.print("삭제내역>>");
						String inven = scanner.nextLine();
						int amount = removeBook(inven);//삭제 메소드는 정수를 반환하므로 정수형 표현을 사용해야함
						balance-=amount;
						break;
					}
					case 4:{
						showBook();
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
