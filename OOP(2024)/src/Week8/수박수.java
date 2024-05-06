package Week8;
import java.util.Scanner;

public class 수박수 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String answer = "";
		
		for (int i = 0; i < n; i++)
		{
			if (i%2 == 0)
				answer += "수";
			else
				answer += "박";
		}
		
		System.out.println(answer);
		
	}
}
