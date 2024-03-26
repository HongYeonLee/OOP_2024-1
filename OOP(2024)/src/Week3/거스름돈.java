package Week3;
import java.util.Scanner;
public class 거스름돈 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int price, money, change;
		int coin500, coin100;
		
		System.out.println("물건 값 : ");
		price = input.nextInt();
		
		System.out.println("투입 금액 : ");
		money = input.nextInt();
		change = money - price;
		
		//거스름돈 동전으로 거슬러주기!
		
		coin500 = change / 500;
		//change100 = (change%500)/100; //한줄로 쓰거나,
		change %= 500;
		coin100 = change/100;
		change %= 100;
		System.out.println("500원 : " + coin500 + "개");
		System.out.println("100원 : " + coin100 + "개");
		System.out.println("100원 미만은 알바에게~ " + change + "원");
		
		input.close();
	}
}
