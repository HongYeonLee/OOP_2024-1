package Week4;

import java.util.Scanner;

public class 예제3_5 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n, count = 0;
		int sum = 0;
		
		//양수만 5개 입력받기!!, 입력받은 수가 음수라면 카운트에서 제외합니다
		
		while (true)
		{
			if (count == 5) //입력받은 양수가 5개이면 while문 탈출
				break;
			
			System.out.printf("%d번째 정수: ", count + 1);
			
			n = input.nextInt();
			
			if (n < 0) //입력받은 정수가 음수이면 다시 정수를 입력받음
				continue;
			
			count++;//양수이면 입력받은 양수의 개수 증가
		}
	}
}
