package Week11;

import java.util.Scanner;

public class 예외처리 {
	
	public static int getInt(String msg) {
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while (true)
		{
			try {
				System.out.print(msg);
				num = input.nextInt();
			}
			catch(java.util.InputMismatchException e)
			{
				System.out.println("숫자가 아닙니다. 다시 입력하세요!");
				input.nextLine(); //엔터 먹어가기
				continue; //위로 올리기
			}
			break; //예외가 발생하지 않아 catch문을 생략했을 경우 break
			
		}

		return num;
	
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
//		try {
//			//정수 2개를 받아 더한 결과를 출력합니다
//			System.out.print("정수1 : ");
//			int num1 = input.nextInt();
//			
//			System.out.print("정수2 : ");
//			int num2 = input.nextInt();
//			
//			int result  = num1 + num2;
//			System.out.println(result);
//		}
//		catch(java.util.InputMismatchException e)
//		{
//			System.out.println("사용자가 정수의 형태가 아닌 값을 넣었습니다!");
//			//e.printStackTrace(); //오류 발생시 나오는 빨간색 글
//		}
		
		int num1 = getInt("정수1: ");
		int num2 = getInt("정수2: ");
		
		int result = num1 + num2;
		
		System.out.println("두 수의 합은 " + result);

	}
}
