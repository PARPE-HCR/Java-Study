package 개인연습;
import java.util.Scanner;
public class Library_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] BookList = new String[10];
		boolean[] isBorrowed = new boolean[10];
		
	
		while(true) {
			System.out.print("도서관리 시스템: 1=등록,2=대여,3=반납,4=목록,5=종료>>>");
			int menu = scanner.nextInt();
			scanner.nextLine();
			switch(menu){
			case 1:{
				System.out.print("도서이름:");
				String Bookname = scanner.nextLine();
				int result = addBook(BookList,isBorrowed,Bookname);
				if (result !=-1) {
					System.out.println("도서가 등록되었습니다");
				}
				else {
					System.out.println("이미 등록된 도서입니다");
				}
				break;
		    }
			case 2:{
				System.out.print("도서이름:");
				String Bookname = scanner.nextLine();
				int result1 = borrowBook(BookList,isBorrowed,Bookname);
				if (result1 !=-1) {
					System.out.println("도서가 대여되었습니다");
				}
				else {
					System.out.println("이미 대여된 도서입니다");
				}
				break;
		    }
			case 3:{
				System.out.print("도서이름:");
				String Bookname = scanner.nextLine();
				int result1 = returnBook(BookList,isBorrowed,Bookname);
				if (result1 !=-1) {
					System.out.println("도서가 반납되었습니다");
				}
				else {
					System.out.println("이미 반납된 도서입니다");
				}
				break;
			}
			case 4:{
				showBook(BookList,isBorrowed);
				break;
			}
			case 5:{
				System.out.print("잘못된 입력입니다");
				return;
			}
			default:
				System.out.print("잘못된 입력입니다");
				break;
		  }
	   }
	}
	//도서관 책 등록 메소드
	public static int addBook(String[] BookList,boolean[] isBorrowed,String Bookname) {
		for(int i=0;i<BookList.length;i++) {
			if(BookList[i]!=null && BookList[i].equals(Bookname)) {
				return -1;
			}
		}
		for(int i=0;i<BookList.length;i++) {
			if(BookList[i]==null &&isBorrowed[i] == false) {
				BookList[i] = Bookname;
				return i;
			}
		}
		return -1;
	} 
	//도서관 책 대여 메소드
	public static int borrowBook(String[] BookList,boolean[] isBorrowed,String Bookname) {
		for(int i=0;i<BookList.length;i++) {
			if(BookList[i] !=null && BookList[i].equals(Bookname) && isBorrowed[i] == false)
			{
				isBorrowed[i] = true;
				return i;
			}	
		}
		return -1;
	}
		

	//도서 반납 메소드
	public static int returnBook(String[] BookList,boolean[] isBorrowed,String Bookname) {
		for(int i=0;i<BookList.length;i++) {
			if(BookList[i] !=null && BookList[i].equals(Bookname) && isBorrowed[i] == true)
			{
				isBorrowed[i] = false;
				return i;
			}
		}
		return -1;
	}
	//도서 목록 출력 메소드
	public static void showBook(String[] BookList,boolean[] isBorrowed) {
		for(int i=0;i<BookList.length;i++) {
			if(BookList[i]!=null) {
				if(isBorrowed[i] == false) {
				System.out.printf("%s:[대여가능]\n",BookList[i]);
			}
			else {
				System.out.printf("%s:[대여중]\n",BookList[i]);
				}
			}
		}
	}
}
