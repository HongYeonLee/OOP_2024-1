package Week11;

import java.util.Scanner;

public class Lab7_3 {
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
	
	private static int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		
		try {
			return num1 / num2;
		}
		catch(java.lang.ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다! 0을 리턴합니다");
			return num2;
		}
	}
	
	public static void main(String[] args)
	{
		int num1 = getInt("정수1: ");
		int num2 = getInt("정수2: ");
		
		int result = num1 + num2;
		
		System.out.println("두 수의 합은 " + result);
		
		int result2 = divide(num1, num2);
		
		System.out.println("두 수의 나눗셈은 " + result2);
	}


}
