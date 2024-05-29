package Week12;

public class Account extends BankUI{
	public String name;
	public String accountNum;
	public int balance;
	
	Account(){
	}
	
	void deposit(int money) {
		balance += money;
		System.out.println("통장에 " + money + "원 입금됨");
	}
	
	void getBalance()
	{
		System.out.println("현재 잔액 : " + balance);
	}
	
	void withDraw(int money)
	{
		if (balance - money <= 0){
			System.out.println("잔액 부족!!");
		}
		else
		{
			balance -= money;
			System.out.println("통장에서 " + money + "원 출금됨");
		}
	}
	
	void showInfo() {
		super.showInfo();
		System.out.println("계좌번호 : " + accountNum);
		System.out.println("예금주명 : " + this.name);
		System.out.println("=================");
	}
	
}
