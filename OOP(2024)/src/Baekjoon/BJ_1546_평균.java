package Baekjoon;
import java.util.Scanner;
public class BJ_1546_평균 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[] score = new double[n];
		double max = score[0];

		for (int i = 0; i < n; i++)
		{
			score[i] = input.nextDouble();
			if (max < score[i]) max = score[i];
		}

		double sum = 0;
		for (int i = 0; i < n; i++)
		{
			score[i] = (score[i]/max)*100;
			sum += score[i];
		}
		System.out.println(sum/n);
	}
}
