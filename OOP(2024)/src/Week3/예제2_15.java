package Week3;
import java.util.Scanner;

public class 예제2_15 {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("메뉴를 입력하세요 : ");
		String order = input.nextLine();
		input.close();
		
		int price = 0;
		
		switch (order)
		{
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 없습니다.");
			
		}
		System.out.println("가격은 " + price + "원 입니다");
	}
}
