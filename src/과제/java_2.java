package 과제;

import java.util.Scanner;

public class java_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String key_Name = "Kim";
		int key_Num = 12345;
		int try_Num = 0;
		while(true) {
			System.out.print("로그인아이디>>");
			String name = scanner.nextLine();
			if(name.equals(key_Name)){
				while(true) {
					System.out.print("비밀번호>>>");
					int password = scanner.nextInt();
					if(password == key_Num) {
						System.out.print("로그인 성공");
						return;
					}
					else {
						System.out.println("비밀번호가 틀렸습니다");
						try_Num++;
						if(try_Num >= 3) {
							System.out.print("로그인 중단");
							return;
						}
					}
				}
			}
			else {
				System.out.println("아이디가 틀렸습니다");
				try_Num++;
				if(try_Num >= 3) {
					System.out.print("로그인 중단");
					return;
				}
			}
		}
	}
}


