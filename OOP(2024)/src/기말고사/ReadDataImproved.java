package 기말고사;

import java.util.Scanner;

public class ReadDataImproved {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int readInt() {
		
		boolean correct = false;
		String number;
		int value = 0;
		
		while(!correct)
		{
			try {
				System.out.print("정수를 입력하세요: ");
				number = sc.nextLine();
				value = Integer.parseInt(number);
				correct = true;
			}catch(NumberFormatException e)
			{
				System.out.println("형식 오류! 다시 입력하세요");
			}
		}
		
		return value;
	}
	
	public static double readDouble() {
		
		boolean correct = false;
		String number;
		double value = 0;
		
		while (!correct)
		{
			try {
				System.out.print("실수를 입력하세요 : ");
				number = sc.nextLine();
				value = Double.parseDouble(number);
				correct = true;
			}catch(NumberFormatException e)
			{
				System.out.println("형식 오류! 다시 입력하세요");
			}
		}

		return value;
		
	}
	public static void main(String[] args) {
		int num1 = readInt();
		double num2 = readDouble();
		
		System.out.println("num1 : " + num1 + "num2 : " + num2);

	}

}
