package Baekjoon;
import java.util.Scanner;
public class BJ_3003 {
	public static void main(String[] args)
	{
		int[] chess = {1, 1, 2, 2, 2, 8};
		int[] inputarray = new int[6];
		int[] checker = new int[6];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i <6; i++)
		{
			inputarray[i] = input.nextInt();
			checker[i] = chess[i] - inputarray[i];
			System.out.printf("%d ", checker[i]);
		}
		input.close();
		
	}
}
