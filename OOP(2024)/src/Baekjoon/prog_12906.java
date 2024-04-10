package Baekjoon;
public class prog_12906 {
	public static void main(String[] args)
	{
		int[] arr = {1,1,3,3,0,1,1};
		int[] temp = new int[arr.length];
		int[] answer;
		int flag = -1; //중복 값 체크 변수
		int count = 0; //answer의 길이
	    
	    for (int i = 0;  i < arr.length; i++)
	    {
	        if (flag != arr[i])
	        {
	        	temp[count] = arr[i];
	        	flag = arr[i];
	        	count++;
	        }
	    }
	    
	    answer = new int[count];
	    for (int j = 0; j < answer.length; j++)
	    {
	    	answer[j] = temp[j];
	    	System.out.printf("%d ", answer[j]);
	    }
	}
}
