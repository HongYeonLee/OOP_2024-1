package Week8;
import java.util.Scanner;

public class 워밍업_2 {
	//문제를 잘 읽고  show_grade의 프로토타입을 수정하세요
	public static void  show_grade(int score){
		//필요한 코드를 작성합니다.	
		String grade ="";

		//점수 구간에 따른 알파벳 부여
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

		String sig = "";
		//점수의 일의 자리 숫자에 따라 +, -부여
		if (score >= 60)
		{
			if(score%10 >= 5 || score == 100)
				grade += "+";
			else
				grade += "-";
		}	
		System.out.println(grade + sig);

	}
	//이 부분은 수정하지 않습니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		show_grade(score);
	}
}
