package Week12;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.name = "나이화";
		a1.accountNum = "123-1234";
		a1.showInfo();
		
		a1.deposit(10000);
		a1.getBalance();
		a1.withDraw(5000);
		a1.getBalance();
		a1.withDraw(10000);
		a1.getBalance();
	}

}
