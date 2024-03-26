package Week3;
import java.util.Scanner;

public class 예제2_10 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int score;
		System.out.println("점수를 입력하세요: ");
		score = input.nextInt();
		
		if (score >= 80)
			System.out.println("합격입니다");
		
		input.close();
	}
}
