package Week4;
import java.util.Scanner;

public class 과제3_트리만들기 {
	
	public static void drawTriangle1(int 높이) //왼쪽 직각 삼각형 그리기
	{
		for (int i = 0; i <= 높이; i++) //i<=높이 주의
		{
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void drawTriangle2(int 높이) //오른쪽 직각 삼각형 그리기
	{
		for (int i = 0; i <= 높이; i++)
		{
			//빈칸 찍는 반복문 추가
			for (int j = 0; j < 높이 - i; j++)
				System.out.print(" "); //공백을 찍을때는 " " 하고 스페이스 넣어두기
			
			for (int k = 0; k <= i; k++) //i<=높이 주의
			{
				System.out.print("*");

			}
			System.out.println();
		}
	}
	
	public static void drawSqure(int 가로) {
		
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
	
	public static void main(String[] args)
	{
		
		int 가로, 세로;
		
		Scanner input = new Scanner(System.in);
		System.out.println("가로: ");
		가로 = input.nextInt();
		
		System.out.println("세로: ");
		세로 = input.nextInt();
		
		drawRectangle(가로, 세로);
		drawTriangle1(세로);
		drawTriangle2(세로);
	}





}
