package Week3;
import java.util.Scanner;

public class 예제2_13 {
	public static void main(String[] args)
	{
		int score, year;
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		score = input.nextInt();
		
		System.out.println("학년을 입력하세요: ");
		year = input.nextInt();
		
		if (year != 4)
		{
			if (score >= 60)
				System.out.println("합격입니다");
			else
				System.out.println("불합격입니다");
		}
		else
		{
			if (score >= 70)
				System.out.println("합격입니다");
			else
				System.out.println("불합격입니다");
		}
	}
}
