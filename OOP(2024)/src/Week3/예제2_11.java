package Week3;
import java.util.Scanner;

public class 예제2_11 {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수를 입력하세요: ");
		num = input.nextInt();
		
		if (num%3 == 0)
			System.out.println("3의 배수 입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		input.close();
	}
}
