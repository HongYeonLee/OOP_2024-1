package Baekjoon;
import java.util.Scanner;

public class prog_두정수사이의합 {
	public static void main(String[] args)
	{
		int a, b, sum = 0;
		Scanner input = new Scanner(System.in);

		a = input.nextInt();
		b = input.nextInt();

		if (a > b)
			for (int i = b; i <= a; i++)
				sum += i;

		else if (a < b)
			for (int j = a; j <= b; j++)
				sum += j;
		else
			sum = a;

		System.out.println(sum);
	}
}
