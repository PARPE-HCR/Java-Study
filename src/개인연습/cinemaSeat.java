package 개인연습;
import java.util.Scanner;
public class cinemaSeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("===영화관 예매 관리 시스템===");
		System.out.print("전체 좌석수>>>");
		int size = scanner.nextInt();
		Cinema mycinema = new Cinema(size);
		mycinema.run();
	}

}
class Seat {
	String name;
	int seatNum;
	boolean res; 
		public Seat (String name,int seatNum,boolean res) {
		this.name = name;
		this.seatNum = seatNum;
		this.res = true; //초기 예약상태 가능
	}
}
//좌석예약 시스템
class Cinema {
	Seat[] Seats; //Seat의 클래스를 Seats라는 이름의 배열로 만들겠다
	public Cinema(int size) {
		Seats = new Seat[size];
		
		for(int i=0;i<Seats.length;i++) {
			Seats[i] = new Seat(null, i + 1,false);
		}
	}
	void seatReserve(String name,int seatNum,boolean res) {
		for(int k=1;k<Seats.length;k++) {
			if(Seats[k] == null) {
				Seats[k].res = false;
				Seats[k] = new Seat(name,seatNum,res);
				System.out.printf("%d번 좌석 예약완료!",Seats[k].seatNum);
				return;
			}
			else {
				System.out.println("이미 예약된 좌석입니다");
				return;
			}
		}
		System.out.println("존재하지않는 좌석번호입니다");
		return;
	}
//예약취소 시스템
	void seatCancel(int seatNum) {
		for(int i=1;i<Seats.length;i++) {
			if(Seats[i].seatNum == seatNum) {
				Seats[i] = null;
				return;
			}
		}
		System.out.println("예약되지 않은 좌석입니다");
		return;
	}
//전체좌석 조회
	void showSeat() {
		System.out.println("====전체 좌석 현황====");
		for(int i=1;i<Seats.length;i++) {
			if(Seats[i].res == true) {
				System.out.printf("%d번 좌석:예약가능\n",Seats[i].seatNum);
				return;
			}
			else {
				System.out.printf("%d번 좌석:예약완료(%s)\n",Seats[i].seatNum,Seats[i].name);
				return;
			}
		}
		return;
	}
//예약자 조회
	void seatCheck(String name) {
		for(int i=1;i<Seats.length;i++) {
			if(Seats[i].name.equals(name)) {
				System.out.println("이 이름으로 예약되어있습니다");
				return;
			}
		}
		System.out.println("일치하는 예약이 없습니다");
		return;
	}
//매출조회
	void showValue() {
		int count = 0;
		for(int i=1;i<Seats.length;i++) {
			if(Seats[i] != null) {
				count ++;
			}
		}
		int value = count * 10000;
		System.out.println("현재예약수:" + count);
		System.out.println("총매출" + value);
		return;
	}
	void run() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("1.좌석예약\n2.예약취소\n3.전체좌석조회\n4.예약자 검색\n5.매출조회\n6.종료\n");
			System.out.print("선택>>>>");
			int menu = scanner.nextInt();
			switch(menu) {
			    /*case 1:{
			    		System.out.print("좌석번호>>>");
			    		int seatNum = scanner.nextInt();
			    		System.out.print("예약자 이름>>>");
			    		String name = scanner.nextLine();
			    		seatReserve();
			    		break;
			    }
			    */
			    case 2:{
					System.out.print("좌석번호>>>");
    					int seatNum = scanner.nextInt();
    					seatCancel(seatNum);
    					break;
			    }
			    case 3:{
			    		showSeat();
					break;
			    }
			    case 4:{
			    		System.out.print("예약자 이름>>>");
			    		String name = scanner.nextLine();
			    		seatCheck(name);
			    		break;
			    }
			    case 5:{
			    		showValue();
			    		break;
			    }
			    case 6:{
			    		System.out.print("시스템을 종료합니다");
			    		return;
			    }
			    default:{
			    		System.out.println("잘못된 입력입니다");
			    		break;
			    }
			}
		}
	}
}