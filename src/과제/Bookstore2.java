package 과제;
import java.util.Scanner;
public class Bookstore2 {
		static Scanner scanner = new Scanner(System.in);
		static Book[] BookArr = new Book[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.print("1=입력,2=삭제,3=출력,4=종료>>");
			int menu = scanner.nextInt();
			scanner.nextLine();
			switch(menu) {
				case 1:{
					addBook();
					break;
				}
				case 2:{
					deleteBook();
					break;
				}
				case 3:{
					showBook();
					break;
				}
				case 4:{
					logOut();
					scanner.close();
					return;
				}
			}
	}
	}
	public static void addBook() {
		System.out.print("제목>>");
		String title = scanner.nextLine();
		System.out.print("저자>>");
		String author = scanner.nextLine();
		System.out.print("가격>>");
		int price = scanner.nextInt();
		System.out.print("개수>>");
		int number = scanner.nextInt();
		for(int i=0;i<BookArr.length;i++) {
			if(BookArr[i] == null) {
				BookArr[i] = new Book(title,author,price,number);
				return;
			}
		}
		System.out.println("더 이상 추가할 수 없습니다");
	}
	public static void deleteBook() {
		System.out.print("삭제할 도서 이름:");
		String name = scanner.nextLine();
		for(int i=0;i<BookArr.length;i++) {
			if(BookArr[i]!=null && BookArr[i].title.equals(name)) {
				BookArr[i] = null;
				System.out.println("삭제되었습니다");
				for(int j= i;j<BookArr.length - 1;j++) {
					BookArr[j]= BookArr[j+1];
				}
				return;
			}
}
		System.out.println("책을 찾을 수 없습니다");
	}
	public static void showBook() {
		int balance = 0;
		for(int i=0;i<BookArr.length;i++) {
			if(BookArr[i] != null) {
				balance += BookArr[i].price * BookArr[i].number;
				System.out.println(BookArr[i].title +" "+ BookArr[i].author +" "
						+BookArr[i].price +"원"+ " " + BookArr[i].number + "권");
			}	
		}
		System.out.println("총액:" + balance + "원");
	}
	public static void logOut() {
		System.out.println("시스템을 종료합니다");
	}
}
