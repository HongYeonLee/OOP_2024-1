package Baekjoon;
import java.util.Scanner;
public class CodeUp_1466_2차원배열순서대로채우기 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				arr[i][j] = n*m - n*j - i;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}
	}
}
