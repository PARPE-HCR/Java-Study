package 과제;
import java.util.Scanner;
public class Bookstore {

	public static void main(String[] args) {
		/*Book b1 = new Book("어린왕자","생텍쥐페리");
		Book b2 = new Book("춘향전");
		System.out.println(b1.title +" "+b1.author);
		System.out.println(b2.title +" "+b2.author);
		*/
		Scanner scanner = new Scanner(System.in);
		Book[] BookArr = new Book[10];
		while(true) {
			System.out.print("1=입력,2=삭제,3=출력,4=종료>>");
			int menu = scanner.nextInt();
			scanner.nextLine();
			switch(menu){
				case 1:{
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
							break;
						}
					}
					break;
					}
				case 2:{
					System.out.print("삭제할 도서 이름:");
					String name = scanner.nextLine();
					for(int i=0;i<BookArr.length;i++) {
						if(BookArr[i].title.equals(name)) {
							BookArr[i] = null;
							System.out.println("삭제되었습니다");
							break;
						}
						else {
							System.out.println("책을 찾을 수 없습니다");
							break;
						}
					}	
				}
				case 3:{
					for(int i=0;i<BookArr.length;i++) {
						if(BookArr[i] != null) {
							System.out.println(BookArr[i].title +" "+ BookArr[i].author +" "
									+BookArr[i].price + " " + BookArr[i].number);
						}
					}
					break;
				}
				case 4:{
					System.out.println("시스템을 종료합니다");
					return;
				}
				}
			}
		}
	}


