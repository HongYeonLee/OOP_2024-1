package 기말고사;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideNum {
	static Scanner sc = new Scanner(System.in);
	
	public static int getInt(String msg)
	{
		int num1 = 0;
		String num2;
		int value;
		
		while(true)
		{
			try {
				System.out.println(msg);
				num1 = sc.nextInt();
				sc.nextLine();
				System.out.println("정수 문자열 : ");
				num2 = sc.nextLine();
				value = Integer.parseInt(num2);
				
			}catch(InputMismatchException e)
			{
				System.out.println("1번 예외 실행");
				sc.nextLine();
			}
			catch(NumberFormatException e)
			{
				System.out.println("2번 실행");
			}
			break;
		}
		
		return num1;
	}
	
	public static int divideNum(int num1, int num2)
	{
		int result;
		try {
			result = num1/num2;
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다! 0을 리턴합니다");
			return 0;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = getInt("정수1 : ");
		int num2 = getInt("정수2 : ");
		
		int result = divideNum(num1, num2);
		System.out.println(result);

	}

}
