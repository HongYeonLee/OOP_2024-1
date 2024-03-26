package Week3;
import java.util.Scanner;
public class 배열로성적매기기 {
	public static void main(String[] args)
	{
		char grade, sig = ' ';
		int score, index;
		Scanner scanner = new Scanner(System.in);
		
		//비교문 대신 배열과 연산식을 이용하면
		char[] gr = {'A', 'B', 'C', 'D', 'F', 'F', 'F', 'F', 'F', 'F'};
		System.out.println("점수를 입력하세요(0 ~ 100): ");
		
		score = scanner.nextInt(); //점수 읽기
		index = (100 - score - 1)/10;
		
		grade = gr[index]; //gr배열에서 index에 해당하는 문자를 가져온다. grade 판단 끝.
		
		//60점 이상일 경우, 일의 자리가 5이상이면 +을 붙여본다.
		if (score>=60)
		{
			if (score == 100 || score%10 >= 5)
				sig = '+';
			else
				sig = '-';
		}
		
		System.out.println("학점은 " + grade + sig + "입니다.");
		scanner.close();
		
	}
}
