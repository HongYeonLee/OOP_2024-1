package Week11;

import java.util.Scanner;

public class Lab7_2 {
	static Scanner input = new Scanner(System.in);
	
	public static int readInt()
	{
		boolean correct = false; //유효한 데이터인지 체크하는 변수
		String number; //입력값을 문자열로 저장한 후 다시 정수로 변환
		int value = 0; //number를 int로 변환한 값
		
		while (!correct)
		{
			try
			{
				System.out.print("정수 입력: ");
				number = input.nextLine(); //우선 입력값을 문자열로 저장
				value = Integer.parseInt(number); //String -> int 변환, NumberFormatException 발생 가능
				correct = true; //만약 예외가 발생하지 않았다면 while 탈출
			}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
				System.out.println("형식 오류 발생! 다시 입력하세요");
			}
		}
		
		return value;
	}
	
	public static double readDouble()
	{
		boolean correct = false;
		String number;
		double value = 0.0;
		
		while(!correct)
		{
			try
			{
				System.out.print("실수 입력: ");
				number = input.nextLine();
				value = Double.parseDouble(number);
				correct = true;
			}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
				System.out.println("형식 오류 발생! 다시 입력하세요");
			}
		}
		
		return value;
	}
	
	public static void main(String[] args)
	{
		int num1 = readInt();
		double num2 = readDouble();
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
