package Baekjoon;
import java.util.Scanner;

public class BJ_2577_숫자의개수 {
	public static void main(String[] args)
	{
		int a, b, c;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		int mul = a*b*c;
		int[] count = new int[10]; // 0 1 2 ... 9 까지의 인덱스에 해당하는 값을 mul값에서 해당하는 숫자의 개수로 지정
		while(mul > 0)
		{
			//처음 10으로 나눈 것의 나머지 -> 1의 자리수, 10으로 나눈 것의 몫 -> 1의 자릿수를 버림 -> 반복
			//mul%10 한 것이 1이면 count 배열의 1 인덱스에 해당 하는 값 증가
			count[mul%10]++;
			mul /= 10;
		}

		for (int i = 0; i < count.length; i++)
		{
			System.out.println(count[i]);
		}
	}
}
