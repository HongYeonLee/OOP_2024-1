package Baekjoon;

import java.util.Scanner;

public class BJ_1330 {

	public static void main(String[] args)
	{

		int a, b;
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		
		if (a > b)
			System.out.println(">");
		else if (a < b)
			System.out.println("<");
		else
			System.out.println("==");
	}
}