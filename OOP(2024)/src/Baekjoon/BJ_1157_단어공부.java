package Baekjoon;
import java.util.Scanner;

public class BJ_1157_단어공부 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int[] alphabet = new int[26];

		for (int i = 0; i < word.length(); i++)
		{
			//대문자일때
			if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z')
			{
				//A는 아스키코드로 65번 -> arr 0번 인덱스의 값 1 증가
				//word.charAt(i)의 값에서 65를 빼준 값을 arr의 인덱스로 지정하여 값 증가
				alphabet[word.charAt(i) - 65]++; 
			}
			//소문자일때
			else
			{
				//a는 아스키코드로 97번 -> arr 0번 인덱스의 값 1 증가
				alphabet[word.charAt(i) - 97]++;
			}
		}

		int max = -1;
		char c = ' ';
		for (int i = 0; i < alphabet.length; i++)
		{
			if (max < alphabet[i])
			{
				max = alphabet[i];
				c = (char)(i + 65);
			}
			else if (max == alphabet[i])
				c = '?';
		}
		System.out.println(c);
		
	}
}
