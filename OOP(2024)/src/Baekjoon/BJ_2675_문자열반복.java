package Baekjoon;
import java.util.Scanner;

public class BJ_2675_문자열반복 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i ++)
		{
			int k = sc.nextInt();
			String str = sc.next();

			for (int j = 0; j < str.length(); j++)
			{
				for (int m = 0; m < k; m++)
					System.out.print(str.charAt(j));
			}
			System.out.println();
			
		}
	}

}
