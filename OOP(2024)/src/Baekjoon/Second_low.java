package Baekjoon;
import java.util.Scanner;

public class Second_low {
	public static void main(String[] args)
	{
		int width, height;
		double area;
		Scanner input = new Scanner(System.in);
		width = input.nextInt();
		height = input.nextInt();
		area = ((double)width*height)/2;
		
		System.out.printf("%.1f", area);
		
	}
}
