package Baekjoon;
import java.util.Scanner;
public class BJ_5086 {
	public static void main(String[] args)
	{
		int a, b;
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		
		while (a != 0 && b!= 0)
		{
			if (a%b == 0)
				System.out.println("multiple");
			else if (b%a == 0)
				System.out.println("factor");
			else
				System.out.println("neither");
			
			//다시 인풋을 받아야지만 while문의 조건식을 다시 체크할 수 있다
			//아니면 기존에 받은 a, b값으로 인해 while문이 계속 돌아가니 주의
			a = input.nextInt();
			b = input.nextInt();
		}	
	}
}
