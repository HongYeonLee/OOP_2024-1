package Baekjoon;

public class prog_같은숫자는싫어 {

	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] temp = new int[arr.length];
		int[] answer = {};
		
		int flag = -1;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++)
			if(flag != arr[i])
			{
				temp[count++] = arr[i];
				flag = arr[i];
			}
		
		answer = new int[count];
		for (int i = 0; i < answer.length; i++)
		{
			answer[i] = temp[i];
		}
			

	}

}
