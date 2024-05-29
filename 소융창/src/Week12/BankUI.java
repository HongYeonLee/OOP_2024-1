package Week12;

public class BankUI {
	private String branchName = "이화여대";
	private int branchCode;
	private String address;
	
	BankUI(){
	}
	
	void showInfo()
	{
		System.out.println("=================");
		System.out.println("지점명 : " + this.branchName);
	}
}
