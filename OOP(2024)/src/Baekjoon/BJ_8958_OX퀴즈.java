package Baekjoon;
import java.util.Scanner;

public class BJ_8958_OX퀴즈 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] arr = new String[n];

		for (int i = 0; i < n; i++)
			arr[i] = input.next();

		int count = 0;
		int answer = 0;

		for (int i = 0; i < n; i++)
		{
			count = 0; 
			answer = 0;

			for (int j = 0; j < arr[i].length(); j++)
			{
				if (arr[i].charAt(j) == 'O')
				{
					count++;
					answer += count;
				}
				else count = 0;
			}
			System.out.println(answer);
		}

	}		

}
