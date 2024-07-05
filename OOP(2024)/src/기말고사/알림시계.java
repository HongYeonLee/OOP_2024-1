package 기말고사;

import java.util.Scanner;

public class 알림시계 {
	public static void main(String[] args)
	{
		int hour, min;
		Scanner input = new Scanner(System.in);
		
		hour = input.nextInt();
		min = input.nextInt();
		
		if (min < 45)
		{
			min += 15;
			if (hour == 0)
				hour = 23;
			else
				hour -= 1;
		}
		else
			min -= 45;
		
		
		System.out.println(hour + " " + min);
	}
}
