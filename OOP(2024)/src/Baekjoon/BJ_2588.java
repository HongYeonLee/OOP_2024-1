package Baekjoon;
import java.util.Scanner;
public class BJ_2588 {
	public static void main(String[] args)
	{
		int a, b;
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		System.out.printf("%d\n", a*(b%10));
		System.out.printf("%d\n", a*(b%100/10));
		System.out.printf("%d\n", a*(b/100));
		System.out.printf("%d", a*b);
	}
}
