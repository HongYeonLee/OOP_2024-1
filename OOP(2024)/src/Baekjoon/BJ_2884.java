package Baekjoon;
import java.util.Scanner;

public class BJ_2884 {
	public static void main(String[] args)
	{
		int hour, min;
		Scanner input = new Scanner(System.in);

		hour = input.nextInt();
		min = input.nextInt();

		if (min < 45)
		{
			//min += 15;
			min = 60 - (45 - min);
			if (hour == 0)
				hour = 23;
			else
				hour -= 1;
		}
		else
			min -= 45;

		System.out.printf("%d %d", hour, min);
	}
}
