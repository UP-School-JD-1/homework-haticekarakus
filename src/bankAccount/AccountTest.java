package bankAccount;

public class AccountTest {

	public static void main(String[] args) {
		Account account1=new Account(3000);
		Account account2=new Account(2500);

		AccountClient accountClient1=new AccountClient("Can",account1);
		accountClient1.withdrawMoney(400);
		accountClient1.depositMoney();
		accountClient1.transferMoney(account2);
	}

}
