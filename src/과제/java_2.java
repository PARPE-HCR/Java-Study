package 과제;

import java.util.Scanner;

public class java_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key_name = "Kim";
		int key_password = 12345;
		int try_num = 0;
		//String name;
		//int password;
		while(true)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("로그인 아이디:");
			String name = scanner.nextLine();
			if(name.equals(key_name))
			{
				System.out.print("로그인 비밀번호:");
				int password = scanner.nextInt();
				if(password == key_password)
				{
					System.out.print("로그인 성공!");
					break;
				}
				else
				{
					System.out.println("비밀번호가 틀렸습니다");
				}
				
				
			}
		}
	}

}
