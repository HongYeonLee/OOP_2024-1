package Week8;
import java.util.Scanner;

public class 구구단 {
	public static void odd()
	{
		for (int i = 1; i < 10; i+=2)
		{
			for (int j = 1; j < 10; j++)
			{
				System.out.printf("%d * %d = %2d ", i, j, i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	public static void even()
	{
		for (int i = 2; i < 10; i+=2)
		{
			for (int j = 1; j < 10; j++)
			{
				System.out.printf("%d * %d = %2d ", i, j, i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	public static void skip()
	{
		for (int i = 1; i <= 19; i += 2)
		{
			for (int j = 1; j < 10; j++)
			{
				System.out.printf("%d * %d = %2d ", i, j, i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		System.out.print("1(홀수단출력) 2(짝수단출력) 3(19단까지스킵출력): ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		switch(n)
		{
			case 1:
				odd();
				break;
			case 2:
				even();
				break;
			case 3:
				skip();
				break;
			default:
				System.out.println("잘못 입력했습니다");
		}
	}
}
