package Baekjoon;
import java.util.Scanner;
public class Second_high {
	public static void main(String[] args)
	{
		int a, b, c;
		int min;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		//a<b가 true이면 a저장, false면 b저장
		//a와 b중 작은 값 < c가 true이면 a와 b중 작은 값 저장, false이면 c저장
		min = (a<b ? a:b)<c ? (a<b ? a:b):c;
		
		System.out.println(min);
	}
	
}
