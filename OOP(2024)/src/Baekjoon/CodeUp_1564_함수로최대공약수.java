package Baekjoon;
import java.util.Scanner;

public class CodeUp_1564_함수로최대공약수 {
	public static void gcd(int a, int b)
	{
		int temp;
		if (a < b)
		{
			temp = a;
			a = b;
			b = temp;
		}

		if (b > 0)
			gcd(b, a%b);
		
		else if (b == 0)
			System.out.println(a);

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		gcd(a, b);

	}
}
