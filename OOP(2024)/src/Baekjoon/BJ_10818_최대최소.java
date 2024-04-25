package Baekjoon;
import java.util.Scanner;
public class BJ_10818_최대최소 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		int max = 0, min =0;

		for (int i = 0; i < n; i++)
		{
			arr[i] = input.nextInt();
			if (i == 0)
			{
				max = arr[i];
				min = arr[i];
			}
			if (max < arr[i]) max = arr[i];
			if (min > arr[i]) min = arr[i];
		}
		System.out.printf("%d %d", min, max);
	}
}
