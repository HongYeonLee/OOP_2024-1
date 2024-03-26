package Week3;
import java.util.Scanner;

public class 예제2_14 {
	public static void main (String[] args)
	{
		int score;
		char grade = ' '; //초기화할 때는 홑따옴표를 쓰고 비워둔다
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요 (0 ~ 100) : ");
		score = input.nextInt();
		
		switch (score/10)
		{
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다");
		input.close();
	}
}
