package Week4;
import java.util.Scanner;

public class 과제2_트리만들기 {
	
	public static void drawLeftTriangle(int 높이) //왼쪽 직각 삼각형 그리기
	{
		for (int i = 0; i <= 높이; i++) //i<=높이 주의
		{
			for (int j = 0; j < i; j++)
				System.out.print("*"); //println 아니고 print!!
			System.out.println();
		}
		
		//또는 for (int i = 0; i < 높이; i++)
		//		for (int j = 0; j <= i; j++)
		//		{
		//			System.out.print("*");
		//		}
		//		System.out.println();
	}
	
	public static void drawRightTriangle(int 높이) //오른쪽 직각 삼각형 그리기
	{
		for (int i = 0; i < 높이; i++) //i<높이 주의
		{
			//빈칸 찍는 반복문 추가
			for (int j = 0; j < 높이 - i; j++) // 높이가 5일때 0번째는 빈칸 5개
				System.out.print(" "); //공백을 찍을때는 " " 하고 스페이스 넣어두기
			
			for (int k = 0; k <= i; k++) //i<=높이 주의
			{
				System.out.print("*");

			}
			System.out.println();
		}
	}
	
	private static void drawRectangle(int 가로, int 세로) {
		
		//가로x세로 그리려면 for문은 세로 -> 가로 순으로 작성
		for (int i = 0; i <세로; i++)
		{
			for (int j = 0; j <가로; j++)
				System.out.print("*");
			
			System.out.println(); //println은 엔터를 포함해서 출력
		}	
	}
	
	public static void drawSqure(int 가로) 
	{
		for (int i = 0; i < 가로; i++)
		{
			for (int j = 0; j < 가로; j++)
				System.out.print("*");
			System.out.println();
		}

	}

	public static void Tree(int 높이)
	{
		for (int i = 0; i < 높이; i++) {

			for (int k = 0; k < 높이 - i; k++)
				System.out.print(" ");

			for (int k = 0; k < i + 1; k++) {
				if (k % 2 == 0)
					System.out.print("☆ ");
				else
					System.out.print("★ ");
			}
			System.out.println();
		}
		
		int a = 0;
		if (높이 % 3 == 0) a = 1;

		for (int i = 0; i < 높이 / 3 ; i++) {

			for (int k = 0; k < 높이-높이/4; k++)
				System.out.print(" ");

			for (int k = 0; k < 높이 / 3+1 ; k++) {
				System.out.print("■ ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		menu();
	}

	private static void menu() {
		
		while(true) 
		{
			System.out.println("=======================================================");
			System.out.println("menu : 1. 왼쪽 삼각형 2. 오른쪽 삼각형 3. 사각형 4. 정사각형 5. 트리 0. 그만");
			System.out.println("=======================================================");
			System.out.print("menu: ");
			Scanner input = new Scanner(System.in);
			int menu = input.nextInt();
			
			if (menu == 0)
			{
				System.out.println("종료되었습니다");
				break;
			}
			
			switch (menu)
			{
			case 1:
				System.out.print("높이 : ");
				int height = input.nextInt();
				drawLeftTriangle(height);
				break;
			
			case 2:
				System.out.print("높이 : ");
				height = input.nextInt();
				drawRightTriangle(height);
				break;
				
			case 3:
				System.out.print("가로, 세로 : ");
				int width = input.nextInt();
				height = input.nextInt();
				drawRectangle(width, height);
				break;
				
			case 4:
				System.out.print("높이 : ");
				height = input.nextInt();
				drawSqure(height);
				break;
			case 5:
				System.out.println("높이 : ");
				height = input.nextInt();
				Tree(height);
				break;
				
			default:
				System.out.println("없는 선택지 입니다.");
				
			}
		}

		
	}
}
