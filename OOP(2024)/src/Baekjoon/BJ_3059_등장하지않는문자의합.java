package Baekjoon;
import java.util.Scanner;
public class BJ_3059_등장하지않는문자의합 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String word = "";
		int sum = 0;
		
		for (int i = 0; i < n; i++)
		{
			word = sc.next();
			int[] alphabet = new int[26];
			
			for (int j = 0; j < word.length(); j++)
				alphabet[word.charAt(j) - 65] = 1;

			
			for (int k = 0; k < 26; k++)
			{
				if (alphabet[k] == 0)
					sum += k + 65;
			}
			
			System.out.println(sum);
			sum = 0;
				
		}
		
	}
}
