package 개인연습;
import java.util.Scanner;
public class bankAccount_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("계좌 소유자:");
		String owner = scanner.nextLine();
		System.out.print("계좌번호:");
		String accountNumber = scanner.nextLine();
		System.out.print("초기잔액:");
		int balance= scanner.nextInt();
		BankAccount s1 = new BankAccount(owner,accountNumber,balance);
		while(true) {
			System.out.println("=====은행계좌관리=====");
			System.out.println("1.입금,2.출금,3.잔액조회,4.계좌정보,5.종료");
			System.out.print("선택>>>>>");
			int menu = scanner.nextInt();
			switch(menu) {
			case 1:{
				System.out.print("입금금액:");
				int amount = scanner.nextInt();
				s1.deposit(amount);
				break;
			}
			case 2:{
				System.out.print("출금금액:");			
				int amount = scanner.nextInt();
				s1.withdraw(amount);
				break;
			}
			case 3:{
				System.out.println("현재 잔액입니다");			
				System.out.printf("잔액:%d\n",s1.getBalance());
				break;
			}
			case 4:{
				System.out.println("계좌정보:");			
				s1.show();
				break;
			}
			
			case 5:{
				System.out.println("시스템 종료");
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
class BankAccount{
	String owner;
	String accountNumber;
	int balance;
	public BankAccount(String owner,String accountNumber) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	public BankAccount(String owner,String accountNumber,int balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		if(balance >= 0) {
			this.balance = balance;
		}
		else {
			this.balance = 0;
		}
	}
	public boolean deposit(int amount) {
		if(amount > 0) {
			balance +=amount;
			System.out.println("입금 성공");
			return true;
		}
		else {
			System.out.println("입금 실패");
			return false;
		}
	}
	public boolean withdraw(int amount) {
		if(amount < balance) {
			balance -=amount;
			System.out.println("출금 성공");
			return true;
		}
		else {
			System.out.println("출금 실패");
			return false;
		}
	}
	public int getBalance() {
		return balance;
	}
	public void show() {
		System.out.println("소유자:"+ owner);
		System.out.println("계좌번호:"+ accountNumber);
		System.out.println("잔액:"+ balance);
	}	
 }



