package 중간고사;
import java.util.Scanner;
public class 삼각형 {
	public static void 왼쪽직각(int 높이)
	{
		for (int i = 0; i < 높이;  i++)
		{
			for (int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void 역왼쪽직각(int 높이)
	{
		for (int i = 0; i < 높이; i++)
		{
			for (int j = 0; j < 높이 - i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void 오른쪽직각(int 높이)
	{
		for (int i = 0; i < 높이; i++)
		{
			//공백찍는 반복문 공백은 "스페이스바"인거 까먹지 말기
			for (int j = 0; j < 높이 - i - 1; j++)
				System.out.print(" ");

			//삼각형찍기
			for (int k = 0; k <= i; k++)
				System.out.print("*");

			System.out.println();
		}	
	}

	public static void 역오른쪽직각(int 높이)
	{
		for (int i = 0; i < 높이; i++)
		{
			//공백찍기
			for (int j = 0; j < i; j++)
				System.out.print(" ");

			//삼각형
			for (int k = 0; k < 높이 - i; k++)
				System.out.print("*");

			System.out.println();
		}

	}

	//오른쪽 직각 삼각형 늘리기
	public static void 정삼각형(int 높이)
	{
		for (int i = 0; i < 높이; i++)
		{
			//공백찍는 반복문
			for (int j = 0; j < 높이 - i - 1; j++)
				System.out.print(" ");

			//삼각형찍기
			for (int k = 0; k <= i; k++)
				System.out.print("* ");

			System.out.println();
		}
	}

	//역 오른쪽 직각 삼각형 늘리기
	public static void 역정삼각형(int 높이)
	{
		for (int i = 0; i < 높이; i++)
		{
			//공백찍기
			for (int j = 0; j < i; j++)
				System.out.print(" ");

			//삼각형찍기
			for (int k = 0; k < 높이 - i; k++)
				System.out.print("* ");

			System.out.println();
		}
	}
	
	//문자 오른쪽삼각형
	public static void 문자오른쪽직각 (int 높이)
	{
		char c = 'A';
		for (int i = 0; i < 높이; i ++)
		{
			//공백 찍기
			for (int j = 0; j < 높이 - i - 1; j++)
				System.out.print(" ");
			for (int k = 0; k <= i; k++)
				System.out.print(c++);
			System.out.println();
		}
	}
	
	//문자 역정삼각형
	
	public static void 문자역정삼각형(int 높이)
	{
		char c = 'A';
		for (int i = 0; i < 높이; i ++)
		{
			//공백찍기
			for (int j = 0; j <i; j++)
				System.out.print(" ");
			//삼각형
			for (int k = 0; k < 높이 - i; k++)
				System.out.print(c++ + " ");
			
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("높이 입력: ");
		int height = input.nextInt();
		왼쪽직각(height);
		System.out.println();
		역왼쪽직각(height);
		System.out.println();
		오른쪽직각(height);
		System.out.println();
		역오른쪽직각(height);
		System.out.println();
		정삼각형(height);
		System.out.println();
		역정삼각형(height);
		System.out.println();
		문자오른쪽직각(height);
		System.out.println();
		문자역정삼각형(height);
	}
}

