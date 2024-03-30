package Baekjoon;
import java.util.Scanner;
public class programmers_2016 
{
	public static void main (String[] args) 
	{
		int month, day;
		
		Scanner input = new Scanner(System.in);
		month = input.nextInt();
		day = input.nextInt();
		
		switch (month-1)
		{
		case 11:
			day += 30;
		case 10:
			day += 31;
		case 9:
			day += 30;
		case 8:
			day += 31;
		case 7:
			day += 31;
		case 6:
			day += 30;
		case 5:
			day += 31;
		case 4:
			day += 30;
		case 3:
			day += 31;
		case 2:
			day += 29;
		case 1:
			day += 31;
			break;
		}
		
		switch(day%7)
		{
		case 1:
			System.out.println("FRI");
			break;
		case 2:
			System.out.println("SAT");
			break;
		case 3:
			System.out.println("SUN");
			break;
		case 4:
			System.out.println("MON");
			break;
		case 5:
			System.out.println("TUE");
			break;
		case 6:
			System.out.println("WED");
			break;
		case 0:
			System.out.println("THU");
			break;
		}
	}
}
