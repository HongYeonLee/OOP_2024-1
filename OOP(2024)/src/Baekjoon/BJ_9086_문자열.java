package Baekjoon;
import java.util.Scanner;

public class BJ_9086_문자열 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str;
		
		for (int i = 0; i < n; i ++)
		{
			str = sc.next();
			System.out.print(str.charAt(0));
			System.out.print(str.charAt(str.length() - 1));
			System.out.println();
		}
	}
}
