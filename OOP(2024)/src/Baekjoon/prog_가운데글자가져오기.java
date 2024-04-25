package Baekjoon;
public class prog_가운데글자가져오기 {
	public static void main(String[] args)
	{
		String answer = "";
		String s = "abcde";
		char[] arr = s.toCharArray();
		int middle1;
		int middle2;
		
		if (arr.length%2 == 0)
		{
			middle1 = arr.length/2;
			middle2 = arr.length/2 - 1;
			answer += arr[middle2];
			answer += arr[middle1];
		}
		else
		{
			middle1 = arr.length/2;
			answer += arr[middle1];
		}
		System.out.println(answer);
	}
}
