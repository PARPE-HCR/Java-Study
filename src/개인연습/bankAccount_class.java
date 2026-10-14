package 개인연습;
import java.util.Scanner;
public class bankAccount_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
class BankAccount{
	String owner;
	String accountNumber;
	int balance;
	public BankAccount(String owner,String accountNumber) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		int balance = 0;
	}
	public BankAccount(String owner,String accountNumber,int balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
}

}
