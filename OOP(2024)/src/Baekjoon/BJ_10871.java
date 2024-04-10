package Baekjoon;
import java.util.Scanner;
public class BJ_10871 {
	public static void main(String[] args)
	{
		int num, max;
		Scanner input = new Scanner(System.in);
		
		num = input.nextInt();
		max = input.nextInt();
		
		int[] array = new int[num];
		for (int i = 0; i <num; i ++) {
			array[i] = input.nextInt();
			if (array[i] < max)
				System.out.printf("%d ", array[i]);
		}	
	}
}
