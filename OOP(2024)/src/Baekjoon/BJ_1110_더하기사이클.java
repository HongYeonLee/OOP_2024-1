package Baekjoon;
import java.util.Scanner;

public class BJ_1110_더하기사이클 {
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int change = (n%10)*10 + (n/10 + n%10)%10;
		int count = 1;
		while (change != n)
		{
			change = (change%10)*10 + (change/10 + change%10)%10;
			count++;
		}
		System.out.println(count);
	}
}
