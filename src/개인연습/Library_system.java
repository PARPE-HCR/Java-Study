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
				int result = addBook(BookList,Bookname);
				System.out.println("도서가 등록되었습니다");
				break;
		    }
			case 2:{
				System.out.print("도서이름:");
				String Bookname = scanner.nextLine();
				int result1 = borrowBook(BookList,isBorrowed,Bookname);
				System.out.println("도서가 대여되었습니다");
				break;
		    }
			case 3:{
				showBook(BookList,isBorrowed);
				break;
			}
		  }
	   }
	}
	//도서관 책 등록 메소드
	public static int addBook(String[] BookList,String Bookname) {
		for(int i=0;i<BookList.length;i++) {
			if(BookList[i]==null) {
				BookList[i] = Bookname;
				return i;
			}
		}
		return -1;
	} 
	//도서관 책 대여 메소드
	public static int borrowBook(String[] BookList,boolean[] isBorrowed,String Bookname) {
		for(int i=0;i<BookList.length;i++) {
			if(BookList[i] !=null && BookList[i].equals(Bookname))
			{
				isBorrowed[i] = true;
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
