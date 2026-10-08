package 과제;

import java.util.Scanner;

public class java_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strGame = {"가위","바위","보"};
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 게임을 시작합니다");
		while(true){
		
			System.out.print("가위바위보!>>");
			String ins = scanner.nextLine();
			
			for(i=0;i<1;i++){
				int select_num = (int)(Math.random() * strGame.length);
				//System.out.print(strGame[select_num]);
				if(ins.equals("가위") && strGame[select_num].equals("보"))
				{
					System.out.printf("사용자는 %s,컴퓨터는 %s.사용자가 이겼습니다",ins,strGame[select_num]);
					System.out.println("");
				}
				else if(ins.equals("바위") && strGame[select_num].equals("가위"))
				{
					System.out.printf("사용자는 %s,컴퓨터는 %s.사용자가 이겼습니다",ins,strGame[select_num]);
					System.out.println("");
				}
				
				else if(ins.equals("보") && strGame[select_num].equals("바위"))
				{
					System.out.printf("사용자는 %s,컴퓨터는 %s.사용자가 이겼습니다",ins,strGame[select_num]);
					System.out.println("");
				}
				else if(ins.equals(strGame[select_num]))
				{
					System.out.printf("사용자는 %s,컴퓨터는 %s.비겼습니다",ins,strGame[select_num]);
					System.out.println("");
				}
				else if(ins.equals("종료"))
				{
					System.out.print("게임을 종료합니다");
					return;
				}
				else
				{
					System.out.printf("사용자는 %s,컴퓨터는 %s.컴퓨터가 이겼습니다",ins,strGame[select_num]);
					System.out.println("");
				}
			}
		}
		
		
	}

}
