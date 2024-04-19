package Week4;
import java.util.Scanner;
public class 삼각형연습 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("높이를 입력하시오: ");
		int 높이 = sc.nextInt();
		
		//왼쪽 직각 삼각형
		for (int i = 0; i < 높이; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//오른쪽 직각 삼각형
		for (int i = 0; i < 높이; i++)
		{
			//공백 찍는 반복문
			for (int j = 0; j < 높이 - i - 1; j++)
				System.out.print(" ");
			
			//별 찍는 반복문
			for (int k = 0; k <= i; k++)
				System.out.print("*");
			System.out.println();

		}
		System.out.println();
		
		//역 왼쪽 직각삼각형
		for (int i = 0; i < 높이; i++)
		{
			for (int j = 0; j <높이 - i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		//역 오른쪽 직각삼각형
		for (int i = 0; i < 높이; i++)
		{
			//공백찍기
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			
			//별찍기
			for (int k = 0; k < 높이 - i; k++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		//정삼각형
		for (int i = 0; i < 높이; i++)
		{
			for (int j = 0; j< 높이 - i - 1; j++)
				System.out.print(" ");
			for (int k = 0; k <= i; k++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println();
		
		//역정삼각형
		for (int i = 0; i < 높이; i++)
		{
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int k = 0; k < 높이 - i; k++)
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.println();
		
		//사각형
		for (int i = 0; i < 높이; i++)
		{
			for(int j = 0; j < 높이; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		
		//문자 역정삼각형		
		char c = 'z';
		for (int i = 0; i < 높이; i++)
		{
			//공백찍기
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			//문자 찍기
			for (int k = 0; k < 높이 - i; k++)
			{
				if (c<'a') c = 'z';
				System.out.print(c-- + " ");
			}
			System.out.println();
		}
			
		
	}
}
