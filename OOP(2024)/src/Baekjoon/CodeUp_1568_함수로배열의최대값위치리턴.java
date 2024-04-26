package Baekjoon;

import java.util.Scanner;

public class CodeUp_1568_함수로배열의최대값위치리턴 {
	public static void maxi(int n, int[] arr, int a, int b)
	{
		int max = arr[a - 1];
		int index = a;
		for (int i = a - 1; i <= b - 1; i++)
		{
			
			if (arr[i] > max)
			{
				max = arr[i];
				index = i + 1;
			}
		}
		
		System.out.println(index);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		maxi(n, arr, a, b);
	}
}
