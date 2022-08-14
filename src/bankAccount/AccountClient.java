package bankAccount;

import java.util.Scanner;

public class AccountClient {
	private String name;
	private Account account;
	public AccountClient(String name, Account account) {
		this.name=name;
		this.account=account;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double withdrawMoney(int money) {
		account.setBalance(account.balance-money);
		System.out.println("G�ncel bakiyeniz: " + account.balance);
		return account.balance;
	}
	
	public void depositMoney() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�ekmek istedi�iniz miktar� giriniz:");
		double money=scan.nextDouble();
		account.setBalance(account.balance-money);
		System.out.println("G�ncel bakiyeniz: " + account.balance);
	}
	double transferCost=4.5;
	public void transferMoney(Account account2) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Havale yapmak istedi�iniz miktar� giriniz:");
		double transfer=scan.nextDouble();
		account2.balance += transfer;
		account.balance -= transfer+transferCost;
		System.out.println("Havale yapt���n�z miktar: "+transfer);
		System.out.println("G�ncel bakiyeniz: " + account.balance);
	}
}
