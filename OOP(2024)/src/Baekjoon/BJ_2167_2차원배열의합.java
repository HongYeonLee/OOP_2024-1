package Baekjoon;
import java.util.Scanner;

public class BJ_2167_2차원배열의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = sc.nextInt();

		int k = sc.nextInt();
		int sum = 0;
		int i, j, x, y;
		
		for (int m = 0; m < k; m++)
		{
			i = sc.nextInt();
			j = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();

			for (int s = i - 1; s <= x - 1; s++)
				for (int f = j - 1; f <= y - 1; f++)
					sum+= arr[s][f];

			System.out.println(sum);
			sum = 0;
			
		}
	}
}
