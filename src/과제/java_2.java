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
		while(true) //로그인 시스템 자체의 반복
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("로그인 아이디:");
			String name = scanner.nextLine();
			if(name.equals(key_name))
			{
				while(true)//비밀번호 틀림/재입력의 반복
				{
					System.out.print("로그인 비밀번호:");
					int password = scanner.nextInt();
					if(password == key_password)
					{
						System.out.println("로그인 성공!");
						return;
					}
					else
					{
						System.out.println("비밀번호가 틀렸습니다");
						try_num++;
						if(try_num >=3)
						{
							System.out.println("로그인을 중단합니다");
							return;
						}
					}
				}
			}
			else
			{
				System.out.println("아이디가 틀렸습니다");
				try_num++;
				if(try_num >= 3)
				{
					System.out.println("로그인을 중단합니다");
					return;
				}
			}	
		}
	}
}

