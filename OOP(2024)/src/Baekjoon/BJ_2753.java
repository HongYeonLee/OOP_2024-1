package Baekjoon;
import java.util.Scanner;

public class BJ_2753 {
	public static void main(String[] args)
	{
		int year;
		Scanner input = new Scanner(System.in);
		year = input.nextInt();
		
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
