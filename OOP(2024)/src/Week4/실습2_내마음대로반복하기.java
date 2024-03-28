package Week4;	
import java.util.Scanner;
public class 실습2_내마음대로반복하기 {
	
	public static void OddMulti(int n)
	{
		for (int i = 1; i <= n; i+=2)
		{
			for (int j = 0; j < 10; j++)
			{
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	public static void EvenMulti(int n)
	{
		for (int i = 2; i <= n; i+=2)
		{
			for (int j = 0; j < 10; j++)
			{
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
			
	}
	
	public static void InverseMulti(int n)
	{
		for (int i = n; i >= 1; i--)
		{
			for (int j = 0; j < 10; j++)
			{
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
	
	public static void SkipMulti()
	{
		for (int i = 2; i <= 19; i+=2)
		{
			for (int j = 0; j < 10; j++)
			{
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("1(홀수단 출력), 2(짝수단 출력), 3(거꾸로 출력), 4(2단씩 출력): ");
		Scanner input = new Scanner(System.in);
		int kind = input.nextInt();
		switch (kind)
		{
			case 1:
				System.out.println("몇 단까지 출력?: ");
				int n = input.nextInt();
				OddMulti(n);
				break;
			case 2:
				System.out.println("몇 단까지 출력?: ");
				int k = input.nextInt();
				EvenMulti(k);
				break;
			case 3:
				System.out.println("몇 단부터 출력?: ");
				int t = input.nextInt();
				InverseMulti(t);
				break;
			case 4:
				SkipMulti();
				break;
			default:
				System.out.println("선택지에 없습니다.");
			
		}
	}
	
	
}
