package Week4;
import java.util.Scanner;

public class 실습2_위시리스트 {
	
	public static void main (String[] args)
	{
		int sum = 0, count = 0;
		while(true) 
		{
			System.out.println("구입하고 싶은 물건의 이름과 가격을 말해주세요: ");
			Scanner input = new Scanner(System.in);
			
			String item = input.next();
			int price = input.nextInt();
			sum += price;
			count++;
			System.out.printf("구입한 물건 : %s, 누계 합계 금액: %d\n\n", item, sum);
			
			if (count >= 5)
			{
				System.out.printf("지금까지 구입한 물건의 개수는 %d개이며 총 금액은 %d원입니다", count, sum);
				break;
			}
		}
	}
}
