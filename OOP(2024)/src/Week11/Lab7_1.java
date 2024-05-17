package Week11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7_1 {
	public static int getInt(String msg)
	{
		int num;
		Scanner input = new Scanner(System.in);
		
		
		while (true)
		{
			try {
				System.out.print(msg);
				num = input.nextInt();
			}
			catch(InputMismatchException e)
			{
				e.printStackTrace();
				System.out.println("입력형식오류! 다시 입력하세요");
				input.nextLine(); //엔터먹어가기용
				continue; //다시 try문으로 올리기
			}
			break; //에러가 발생하지 않아 catch문을 건너뛸 경우
		}
		
		return num;
	}
	
	public static void main(String[] args)
	{
		int num1 = getInt("정수1을 입력하세요 : ");
		int num2 = getInt("정수2를 입력하세요 : ");
	}
}
