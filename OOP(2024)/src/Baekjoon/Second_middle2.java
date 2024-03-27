package Baekjoon;
import java.util.Scanner;

public class Second_middle2 {
	public static void main(String[] args)
	{
		int a, b;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.printf("%d\n", a+b);
		System.out.printf("%d\n", a-b);
		System.out.printf("%d\n", a*b);
		System.out.printf("%d\n", a/b);
		System.out.printf("%d\n", a%b);
		System.out.printf("%.2f", (double)a/b);
	}
}
