package Week3;
import java.util.Scanner;
public class 예제2_12 {
	public static void main (String[] args)
	{
		int score;
		String grade = ""; //초기화할 때는 홑따옴표를 쓰고 비워둔다
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요 (0 ~ 100) : ");
		score = input.nextInt();
		
		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";
		
		// + , - 붙이기
		
		if (score >= 60) //F등급에 +달리는 것 방지
		{
			if (score%10 >= 5 || score == 100)
				grade += "+";
			else
				grade += "-";
		}
		
		System.out.println("학점은 " + grade + "입니다.");

		
		input.close();
	}
}
